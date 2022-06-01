package DAO;

import Models.Users.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {

    private List<Customer> Customers;

    public CustomerDAO(List<Customer> customers) {
        this.Customers = new ArrayList<>();
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(String dni) {

    }

    @Override
    public void getCustomers(String entityName) {

    }
}
