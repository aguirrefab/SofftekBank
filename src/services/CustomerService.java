package services;

import dao.CustomerDAO;
import dao.ICustomerDAO;
import models.users.Customer;

import java.util.List;

public class CustomerService implements ICustomerService {

    private ICustomerDAO customerDAO;

    public CustomerService(ICustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDAO.add(customer);

    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerDAO.delete(customer);

    }

    @Override
    public Customer findCustomerByDni(String dni) {
        return (Customer) customerDAO.findCustomersByDni(dni);

    }
}

//    @Override
//    public List<Customer> listCustomersByBankEntityCode(Integer entityCode) {
//        return customerDAO.
//
//    @Override
//    public List<Customer> listCustomersBySubsidiaryId(Integer entityId) {
//        return customerDAO.
//    }
//}