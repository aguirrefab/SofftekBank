package dao;

import models.accounts.Account;
import models.accounts.SavingAccount;
import models.banks.Bank;
import models.database.IDBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class BankDAO extends IDBConnection implements IBankDAO{

    private List<Bank> banks;

    private static BankDAO instance;

    public BankDAO() {
        this.banks = new ArrayList<>();
    }

    // Apply Singleton Pattern
    static public BankDAO getInstance() {
        if (instance == null) {
            instance = new BankDAO();
        }
        return instance;
    }

    @Override
    public void add(Bank bank) {
        try {
            connectToDB();
            String query = "INSERT INTO bancos(nombre) VALUES(?)";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, bank.getEntityName());

            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            while (rs.next()){
                bank.setEntityCode(rs.getInt(1));
            }

            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Bank bank) {


        try {
            connectToDB();
            String query = "DELETE FROM bancos WHERE id = ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setInt(1, bank.getEntityCode());

            preparedStatement.executeUpdate();
            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateBankEntity(Integer entityCode){

        Bank bank;

        try {
            connectToDB();
            String query = "UPDATE bancos SET nombre = ? WHERE id = ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setInt(1, entityCode);

            preparedStatement.executeUpdate();
            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Bank findBankByEntityCode(Integer entityCode){

        Bank bank;

        try {
            connectToDB();
            String query = "SELECT * FROM bancos WHERE id_banco LIKE ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setLong(1, entityCode);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()){
                bank = new Bank();
                bank.setEntityCode(rs.getInt(1));
                bank.setEntityName(rs.getString(2));

                return bank;
            }

            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return  null;

    }



}









