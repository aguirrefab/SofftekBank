package services;

import dao.CustomerDAO;
import dao.ICustomerDAO;
import models.users.Customer;

import java.util.List;

public class CustomerService implements ICustomerService {

    private ICustomerDAO customerDAO;

    public CustomerService() {
        this.customerDAO = new CustomerDAO();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerDAO.deleteCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
    }

    @Override
    public Customer findCustomersByDni(Integer DNI) {
        return customerDAO.findCustomersByDni(DNI);
    }

    @Override
    public List<Customer> listCustomersByBankEntityCode(Integer entityCode) {
        return customerDAO.listCustomersByBankEntityCode(entityCode);
    }
    @Override
    public List<Customer> listCustomersByBranchId(Integer entityId) {
        return customerDAO.listCustomersByBranchId(entityId);
    }
}
