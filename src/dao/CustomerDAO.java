package dao;

import models.users.Customer;

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
    public Customer findCustomerById(String dni) {
        return null;
    }

    @Override
    public List<Customer> listCustomersByBankEntityCode(Integer entityCode) {
        return null;
    }

    @Override
    public List<Customer> listCustomersBySubsidiaryId(Integer entityId) {
        return null;
    }
}
