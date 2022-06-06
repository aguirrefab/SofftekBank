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
    public static CustomerDAO getInstance() {
        if (instance == null) {
            instance = new CustomerDAO();
        }
        return instance;
    }

    public void addCustomer(Customer customer) {
        try {
            String query = "INSERT INTO customers(dni, name, surname, email, phone_number, address, registratio_date) VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setLong(1, customer.getDni());
            prStmt.setString(2, customer.getName());
            prStmt.setString(3, customer.getSurname());
            prStmt.setString(4, customer.getEmail());
            prStmt.setString(5, customer.getPhoneNumber());
            prStmt.setString(6, customer.getAddress());
            prStmt.setDate(7, (Date) customer.getRegistrationDate());
            prStmt.executeUpdate(query);

            prStmt.close();

        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void deleteCustomer(Customer customer) {
        try {
            String query = "DELETE FROM customers WHERE dni = ?";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setInt(1, customer.getDni());

            prStmt.executeUpdate(query);

            prStmt.close();

        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public Customer findCustomersByDni(Integer DNI) {
        try {
            String query = "SELECT * FROM customers WHERE dni = ? ";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setInt(1, DNI);
            ResultSet rs = prStmt.executeQuery(query);

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


        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public void updateCustomer(Customer customer){

        try {
            String query = "UPDATE customers SET name = ?, surname = ?, email = ?, phone_number = ?, address ?";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setString(1, customer.getName());
            prStmt.setString(2, customer.getSurname());
            prStmt.setString(3, customer.getEmail());
            prStmt.setString(4, customer.getPhoneNumber());
            prStmt.setString(5, customer.getAddress());

            prStmt.executeUpdate(query);

            prStmt.close();
            DataConnection.getConnection().close();

        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public List<Customer> listCustomersByBankEntityCode(Integer entityCode) {

        try {
            String query = "SELECT * FROM accounts WHERE entity_code = ?";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setInt(1, entityCode);
            ResultSet rs = prStmt.executeQuery(query);

            List<Customer> customersByBank = new ArrayList<>();

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

                customersByBank.add(customer);

            }
            rs.close();
            prStmt.close();

            return customersByBank;

        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    @Override
    public List<Customer> listCustomersByBranchId(Integer branchId) {

        try {
            String query = "SELECT * FROM accounts WHERE branch_id = ?";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setInt(1, branchId);
            ResultSet rs = prStmt.executeQuery(query);

            List<Customer> customersByBranch = new ArrayList<>();

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

                customersByBranch.add(customer);

            }
            rs.close();
            prStmt.close();

            return customersByBranch;

        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}