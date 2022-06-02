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
        return null;
    }

    @Override
    public List<Customer> listByBankEntityCode(Integer entityCode) {
        return null;
    }

    @Override
    public List<Customer> listBySubsidiaryId(Integer entityId) {
        return null;
    }
}
