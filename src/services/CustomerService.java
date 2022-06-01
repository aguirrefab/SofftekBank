package services;

import models.users.Customer;

import java.util.List;

public class CustomerService implements ICustomerService{


    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(String dni) {

    }

    @Override
    public Customer findCustomerById(String dni) {
        return Customer;
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
