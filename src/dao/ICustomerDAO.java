package dao;

import models.users.Customer;

import java.util.List;


public interface ICustomerDAO {
    void addCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    void updateCustomer(Customer customer);

    Customer findCustomersByDni(Integer DNI);

    List<Customer> listCustomersByBankEntityCode(Integer entityCode);

    List<Customer> listCustomersByBranchId(Integer entityId);

}



