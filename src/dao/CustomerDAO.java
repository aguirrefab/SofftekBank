package dao;

import models.users.Customer;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {


    private static CustomerDAO instance;

    public CustomerDAO() {}

    // Apply Singleton Pattern
    static public CustomerDAO getInstance() {
        if (instance == null) {
            instance = new CustomerDAO();
        }
        return instance;
    }


    public void add(Customer customer) {
        try {
            String query = "INSERT INTO customers(dni, name, surname, email, phone_number, address, registratio_date) VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setLong(1, customer.getDni());
            prStmt.setString(2, customer.getName());
            prStmt.setString(3, customer.getSurname());
            prStmt.setString(4, customer.getEmail());
            prStmt.setString(5, customer.getPhoneNumber());
            prStmt.setString(6, customer.getAddress());
            prStmt.setDate(7, (Date) customer.getRegistrationDate());
            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Customer customer) {
        try {
            String query = "DELETE FROM customers WHERE dni = ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setInt(1, customer.getDni());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer findCustomersByDni(Integer DNI) {
        try {
            String query = "SELECT * FROM customers WHERE dni = ? ";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setInt(1, DNI);
            ResultSet rs = prStmt.executeQuery(query);

            List<Customer> customerByDni = new ArrayList<>();

            Customer customer;
            while (rs.next()){
                customer = new Customer();
                customer.setDni(rs.getInt(1));
                customer.setName(rs.getString(2));
                customer.setSurname(rs.getString(3));
                customer.setEmail(rs.getString(4));
                customer.setAddress(rs.getString(5));
                customer.setPhoneNumber(rs.getString(6));
                customer.setBranchId(rs.getInt(7));
                customer.setRegistrationDate(rs.getDate(8));

                return customer;
            }
            rs.close();
            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateCustoemer(Customer customer){

        try {
            String query = "UPDATE customers SET name = ?, surname = ?, email = ?, phone_number = ?, address ?";
            PreparedStatement prStmt = DataConnection.getConection().prepareStatement(query);

            prStmt.setString(1, customer.getName());
            prStmt.setString(2, customer.getSurname());
            prStmt.setString(3, customer.getEmail());
            prStmt.setString(4, customer.getPhoneNumber());
            prStmt.setString(5, customer.getAddress());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}










