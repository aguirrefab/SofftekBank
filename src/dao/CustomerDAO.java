package dao;

import models.database.DBConnection;
import models.users.Customer;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {

    Connection connectionDB = DBConnection.getConnection();

    private List<Customer> Customers;

    public CustomerDAO(List<Customer> customers) {
        this.Customers = new ArrayList<>();
    }


    @Override
    public void add(Customer customer) {

    }

    @Override
    public void delete(Customer dni) {

    }

    @Override
    public void modify(Customer customer) {

    }

    @Override
    public Customer findById(String dni) {

        return Customer;
    }

    @Override
    public List<Customer> listByBankEntityCode(Integer entityCode) {
        return List<Customer>;
    }

    @Override
    public List<Customer> listBySubsidiaryId(Integer entityId) {
        return List<Customer>;
    }
}
