package dao;

import models.banks.Bank;
import models.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankDAO implements IBankDAO{

    private final List<Bank> banks;

    public BankDAO(){
        this.banks = new ArrayList<>();
    }


    @Override
    public void add(Bank bank) {

        try{
            Connection connectionDB = DBConnection.getConnection();

            PreparedStatement preparedStatement = connectionDB.prepareStatement("INSERT INTO banco (entityName) VALUES (?)",PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(bank.setEntityName());

            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            while (rs.next()){
                banco.setId(rs.getInt(1));
            }

            connection.close();
        }catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void delete(Bank dni) {

    }

    @Override
    public void modify(Bank customer) {

    }

    @Override
    public Bank findById(Integer String) {
        return null;
    }

    @Override
    public Bank findById(String dni) {
        return null;
    }

    @Override
    public List<Bank> listByBankEntityCode(Integer entityCode) {
        return null;
    }

    @Override
    public List<Bank> listBySubsidiaryId(Integer entityId) {
        return null;
    }
}
