package dao;

import models.banks.Bank;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDAO implements IBankDAO{

    // Instance variable for the objetc BankDAO


    private static BankDAO instance;

    public BankDAO() {}

    // Apply Singleton Pattern
    static public BankDAO getInstance() {
        if (instance == null) {
            instance = new BankDAO();
        }
        return instance;
    }

    public void add(Bank bank) {
        try {
            String query = "INSERT INTO banks(entity_name, country) VALUES(?, ?, ?)";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setString(2, bank.getEntityName());
            prStmt.setString(3, bank.getCountry());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Bank bank) {
        try {
            String query = "DELETE FROM banks WHERE entity_code = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setLong(1, bank.getEntityCode());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateBankEntity(Bank bank){
        try {
            String query = "UPDATE banks SET entity_name ?, country = ? WHERE entity_code = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setString(1, bank.getEntityName());
            prStmt.setString(2, bank.getCountry());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Bank findBankByEntityCode(Long entityCode){
        Bank bank;
        try {
            String query = "SELECT * FROM banks WHERE entity_code = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setLong(1, entityCode);
            ResultSet rs = prStmt.executeQuery(query);

            if (rs.next()){
                bank = new Bank();
                bank.setEntityCode(rs.getLong(1));
                bank.setEntityName(rs.getString(2));
                bank.setEntityName(rs.getString(2));
                bank.setCountry(rs.getString(3));
                return bank;
            }
            prStmt.close();
            rs.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}