package dao;

import models.users.Customer;
import models.users.Employee;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements IEmployeeDAO {

    // Instance variable for the objetc EmployeeDAO
    private static EmployeeDAO instance;

    public EmployeeDAO() {
    }

    // Apply Singleton Pattern
    public static EmployeeDAO getInstance() {
        if (instance == null) {
            instance = new EmployeeDAO();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {

        try {
            String query = "INSERT INTO employees(dni, name, surname, email, phone_number, address, registration_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setLong(1, employee.getDni());
            prStmt.setString(2, employee.getName());
            prStmt.setString(3, employee.getSurname());
            prStmt.setString(4, employee.getEmail());
            prStmt.setString(5, employee.getPhoneNumber());
            prStmt.setString(6, employee.getAddress());
            prStmt.setDate(7, (Date) employee.getRegistrationDate());
            prStmt.setInt(8, employee.getPersonalFileId());
            prStmt.setString(9, employee.getJobRole());
            prStmt.executeUpdate();

            DataConnection.getConnection().commit();

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

    public void deleteEmployee(Employee employee) {
        try {
            String query = "DELETE FROM employees WHERE dni = ?";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setInt(1, employee.getDni());

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

    public Employee findEmployeeByDni(Integer DNI) {
        try {
            String query = "SELECT * FROM employees WHERE dni = ? ";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setInt(1, DNI);
            ResultSet rs = prStmt.executeQuery(query);

            List<Customer> customerByDni = new ArrayList<>();

            Employee employee;
            while (rs.next()){
                employee = new Employee();
                employee.setDni(rs.getInt(1));
                employee.setName(rs.getString(2));
                employee.setSurname(rs.getString(3));
                employee.setEmail(rs.getString(4));
                employee.setAddress(rs.getString(5));
                employee.setPhoneNumber(rs.getString(6));
                employee.setBranchId(rs.getInt(7));
                employee.setRegistrationDate(rs.getDate(8));
                employee.setPersonalFileId(rs.getInt(9));
                employee.setJobRole(rs.getString(10));

                return employee;
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

    public void updateEmployee(Employee employee){

        try {
            String query = "UPDATE employees SET name = ?, surname = ?, email = ?, phone_number = ?, address ?, job_role ?";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setString(1, employee.getName());
            prStmt.setString(2, employee.getSurname());
            prStmt.setString(3, employee.getEmail());
            prStmt.setString(4, employee.getPhoneNumber());
            prStmt.setString(5, employee.getAddress());
            prStmt.setString(6, employee.getJobRole());

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
}