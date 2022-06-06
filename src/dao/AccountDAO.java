package dao;

import models.accounts.Account;
import models.accounts.SavingAccount;

import java.sql.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AccountDAO implements IAccountDAO{

    // Instance variable for the objetc AccountDao
    private static AccountDAO instance;

    private AccountDAO() {}

    // Apply Singleton Pattern
    static public AccountDAO getInstance() {
        if (instance == null) {
            instance = new AccountDAO();
        }
        return instance;
    }

    public void add(Account account){
        try {
            String query = "INSERT INTO accounts('', entityBank_code, branch_id, cbu, customer_id, account_type, currency_type, balance) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setLong(2, account.getBank().getEntityCode());
            prStmt.setLong(3, account.getBranch().getEntityId());
            prStmt.setLong(4,account.getCBU());
            prStmt.setInt(5, account.getCustomer().getDni());
            prStmt.setString(6, account.getTypeOfAccount());
            prStmt.setString(7, account.getTypeOfCurrency());
            prStmt.setDouble(8, account.getBalance());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSavingAccount(Account account) {
        try {
            String query = "DELETE FROM saving_accounts WHERE customer_id = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setInt(1, account.getCustomer().getDni());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCheckingAccount(Account account) {
        try {
            String query = "DELETE FROM checking_accounts WHERE customer_dni = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setInt(1, account.getCustomer().getDni());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void updateSavingAccountBalance(Account account) {
        try {
            String query = "UPDATE FROM saving_accounts SET balance = ? WHERE customer_dni = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setDouble(1, account.getBalance());
            prStmt.setInt(2, account.getCustomer().getDni());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage() + e.getClass());
        }
    }

    public void updateCheckingAccountBalance(Account account) {
        try {
            String query = "UPDATE FROM checking_accounts SET balance = ? WHERE customer_dni = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setDouble(1, account.getBalance());
            prStmt.setInt(2, account.getCustomer().getDni());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage() + e.getClass());
        }
    }

    @Override
    public Account findAccountByCBU(Long CBU) {
        try {
            String query = "SELECT * FROM saving_accounts AS ca JOIN checking_accounts AS cc ON ca.cbu = cc.cbu WHERE cbu = ? ";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setLong(1, CBU);
            ResultSet rs = prStmt.executeQuery(query);

            Account account;
            while (rs.next()){
                account = new SavingAccount();
                account.setCBU(rs.getLong(1));
                account.setCustomer(CustomerDAO.getInstance().findCustomersByDni(rs.getInt(2)));
                account.setBranch(BranchDAO.getInstance().findBranchById(rs.getLong(3)));
                account.setTypeOfAccount(rs.getString("account_type"));
                account.setIdAccount(rs.getInt(5));
                account.setBalance(rs.getDouble(6));
                return account;
            }
            rs.close();
            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }
    public List<Account> findAccountByDNI(Integer DNI) {

        try {
            String query = "SELECT * FROM saving_accounts AS ca JOIN checking_accounts AS cc ON ca.cbu = cc.cbu WHERE dni = ? ";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setInt(1, DNI);
            ResultSet rs = prStmt.executeQuery(query);

            List<Account> customerAccounts = new ArrayList<>();

            Account account;
            while (rs.next()){
                account = new SavingAccount();
                account.setCBU(rs.getLong(1));
                account.setCustomer(CustomerDAO.getInstance().findCustomersByDni(rs.getInt(2)));
                account.setBranch(BranchDAO.getInstance().findBranchById(rs.getLong(3)));
                account.setTypeOfAccount(rs.getString("account_type"));
                account.setIdAccount(rs.getInt(5));
                account.setBalance(rs.getDouble(6));
                customerAccounts.add(account);
            }
            rs.close();
            prStmt.close();
            DataConnection.getConection().close();

            return customerAccounts;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Account> listAccountByBankEntityCode(Integer entityCode) {

        try {
            String query = "SELECT * FROM accounts WHERE entity_code = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setInt(1, entityCode);
            ResultSet rs = prStmt.executeQuery(query);

            List<Account> bankAccounts = new ArrayList<>();

            Account account;
            while (rs.next()){
                account = new SavingAccount();
                account.setCBU(rs.getLong(1));
                account.setCustomer(CustomerDAO.getInstance().findCustomersByDni(rs.getInt(2)));
                account.setBranch(BranchDAO.getInstance().findBranchById(rs.getLong(3)));
                account.setTypeOfAccount(rs.getString("account_type"));
                account.setIdAccount(rs.getInt(5));
                account.setBalance(rs.getDouble(6));

                bankAccounts.add(account);

            }
            rs.close();
            prStmt.close();
            DataConnection.getConection().close();

            return bankAccounts;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Account> listAccountByBranchId(Integer branchId) {

        try {
            String query = "SELECT * FROM saving_accounts AS ca JOIN checking_accounts AS cc ON ca.branch_id = cc.branch_id WHERE branch_id = ? ";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setInt(1, branchId);
            ResultSet rs = prStmt.executeQuery(query);

            List<Account> branchAccounts = new ArrayList<>();
            Account account;

            while (rs.next()){
                account = new SavingAccount();
                account.setCBU(rs.getLong(1));
                account.setCustomer(CustomerDAO.getInstance().findCustomersByDni(rs.getInt(2)));
                account.setBranch(BranchDAO.getInstance().findBranchById(rs.getLong(3)));
                account.setTypeOfAccount(rs.getString("account_type"));
                account.setIdAccount(rs.getInt(5));
                account.setBalance(rs.getDouble(6));

                branchAccounts.add(account);
            }
            rs.close();
            prStmt.close();
            DataConnection.getConection().close();

            return branchAccounts;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
