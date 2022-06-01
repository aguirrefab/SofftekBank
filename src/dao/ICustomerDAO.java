package dao;

import models.users.Customer;

import java.util.List;

public interface ICustomerDAO {

    void addCustomer(Customer customer);

    void deleteCustomer(String dni);

    void modifyCustomer(Customer customer);

    Customer findCustomerById(String dni);

    List<Customer> listCustomersByBankEntityCode(Integer entityCode);

    List<Customer> listCustomersBySubsidiaryId(Integer entityId);


}
