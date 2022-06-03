package dao;

import models.accounts.Account;
import models.banks.Bank;
import models.database.IDBConnection;
import models.users.Customer;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends IDBConnection implements ICustomerDAO {


    private List<Customer> customers;

    private static CustomerDAO instance;

    public CustomerDAO() {
        this.customers = new ArrayList<>();
    }

    // Apply Singleton Pattern
    static public CustomerDAO getInstance() {
        if (instance == null) {
            instance = new CustomerDAO();
        }
        return instance;
    }


    @Override
    public void add(Customer customer) {

        try {
            connectToDB();
            String query = "INSERT INTO clientes (id_sucursal,dni,nombre,apellido,email,num_telefono,fecha_alta) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setInt(1, customer.getSubsidiaryId());
            preparedStatement.setString(2, customer.getDni());
            preparedStatement.setString(3, customer.getName());
            preparedStatement.setString(4, customer.getSurname());
            preparedStatement.setString(5, customer.getEmail());
            preparedStatement.setString(6, customer.getPhoneNumber());
            preparedStatement.setDate(7, (Date) customer.getRegistrationDate());


            preparedStatement.executeUpdate();
            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void delete(Customer customer) {
        try {
            connectToDB();
            String query = "DELETE FROM clientes WHERE dni = ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setString(1, customer.getDni());

            preparedStatement.executeUpdate();
            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Customer> findCustomersByDni(String dni) {

        Customer customer;

        SubsidiaryDAO.getInstance();

        try {
            connectToDB();
            String query = "SELECT * FROM clientes WHERE id = ?";
            PreparedStatement preparedStatement = connectionDB.prepareStatement(query);
            preparedStatement.setString(1, dni);

            ResultSet rs = preparedStatement.executeQuery();

            List<Customer> custumersByDni = new ArrayList<>();

            while (rs.next()) {
                customer = new Customer();
                customer.setDni(rs.getString(1));
                //customer.setSubsidiaryId(subsidiary.findSubsidiaryById(rs.getInt(2)));
                customer.setName(rs.getString(3));
                customer.setSurname(rs.getString(4));
                customer.setEmail(rs.getString(5));
                customer.setPhoneNumber(rs.getString(6));
                customer.setRegistrationDate(rs.getDate(7));

                return custumersByDni;
            }
            connectionDB.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}










