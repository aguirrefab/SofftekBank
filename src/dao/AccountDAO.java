package dao;

import models.accounts.Account;
import models.accounts.SavingAccount;
import models.database.IDBConnection;
import java.sql.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AccountDAO extends IDBConnection implements IAccountDAO{

    private List<Account> accounts;

    // Instance variable for the objetc AccountDao
    private static AccountDAO instance;

    private AccountDAO() {
        this.accounts = new ArrayList<>();
    }

    // Apply Singleton Pattern
    static public AccountDAO getInstance() {
        if (instance == null) {
            instance = new AccountDAO();
        }
        return instance;
    }

    @Override
    public void add(Account account) {
        try {
            connectToDB();
            String query = "INSERT INTO cuentas(cbu, saldo, id_cliente, tipo_cuenta) VALUES(?, ?, ?, ?)";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setLong(1, account.getCBU());
            preparedStatement.setDouble(2, 0.0);
            preparedStatement.setString(3, account.getCustomerDni());
            preparedStatement.setString(4, account.getTipeOfAccount());

            preparedStatement.executeUpdate();
            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Account account) {
        try {
            connectToDB();
            String query = "DELETE FROM cuentas WHERE id = ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setInt(1, account.getIdAccount());

            preparedStatement.executeUpdate();
            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public  Integer updateAccountBalance(Account account) {
        try {
            connectToDB();
            String query = "UPDATE cuentas SET saldo = ? WHERE id = ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setDouble(1, account.getBalance());
            preparedStatement.setInt(1, account.getIdAccount());

            connectionDB.close();
            return preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public Account findAccountByCBU(Long CBU) {

        BankDAO.getInstance();
        CustomerDAO.getInstance();
        Account account;

        try {
            connectToDB();
            String query = "SELECT * FROM cuentas WHERE id_cuenta LIKE ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setLong(1, CBU);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()){
                account = new SavingAccount();
                account.setCBU(rs.getLong("cbu"));
                account.setTipeOfAccount(rs.getString("tipo_cuenta"));
                account.setCustomerDni(rs.getString("id_cliente"));
                account.setBalance(rs.getDouble("saldo"));
                account.setIdAccount(rs.getInt("id"));
                return account;
            }

            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return  null;
    }


    public Account findAccountByDNI(String DNI) {

        BankDAO.getInstance();
        CustomerDAO.getInstance();
        Account account;

        try {
            connectToDB();
            String query = "SELECT * FROM cuenta WHERE id_cuenta LIKE ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setString(1, DNI);
            ResultSet rs = preparedStatement.executeQuery();

            List<Account> customerAccounts = new ArrayList<>();

            while (rs.next()){
                account = new SavingAccount();
                account.setCBU(rs.getLong("cbu"));
                account.setTipeOfAccount(rs.getString("tipo_cuenta"));
                account.setCustomerDni(rs.getString("id_cliente"));
                account.setBalance(rs.getDouble("saldo"));
                account.setIdAccount(rs.getInt("id"));
                customerAccounts.add(account);
            }
            connectionDB.close();
            return (Account) customerAccounts;

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return  null;
    }

    @Override
    public List<Account> listAccountByBankEntityCode(Integer entityCode) {

        BankDAO.getInstance();
        CustomerDAO.getInstance();
        Account account;

        try {
            connectToDB();
            String query = "SELECT * FROM cuenta WHERE id_banco LIKE ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setInt(1, entityCode);
            ResultSet rs = preparedStatement.executeQuery();

            List<Account> bankAccounts = new ArrayList<>();

            while (rs.next()){
                account = new SavingAccount();
                account.setCBU(rs.getLong("cbu"));
                account.setTipeOfAccount(rs.getString("tipo_cuenta"));
                account.setCustomerDni(rs.getString("id_cliente"));
                account.setBalance(rs.getDouble("saldo"));
                account.setIdAccount(rs.getInt("id"));
                bankAccounts.add(account);
            }
            connectionDB.close();
            return bankAccounts;

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return  null;

    }

    @Override
    public List<Account> listAccountBySubsidiaryId(Integer idSubsidiary) {
        BankDAO.getInstance();
        CustomerDAO.getInstance();
        Account account;

        try {
            connectToDB();
            String query = "SELECT * FROM cuenta WHERE id_sucursal LIKE ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setInt(1, idSubsidiary);
            ResultSet rs = preparedStatement.executeQuery();

            List<Account> subsidiaryAccounts = new ArrayList<>();

            while (rs.next()){
                account = new SavingAccount();
                account.setCBU(rs.getLong("cbu"));
                account.setTipeOfAccount(rs.getString("tipo_cuenta"));
                account.setCustomerDni(rs.getString("id_cliente"));
                account.setBalance(rs.getDouble("saldo"));
                account.setIdAccount(rs.getInt("id"));
                subsidiaryAccounts.add(account);
            }
            connectionDB.close();
            return subsidiaryAccounts;

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return  null;
    }

}
