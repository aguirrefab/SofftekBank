package dao;

import models.users.Customer;

public interface ICustomerDAO {

    void addCustomer(Customer customer);

    void deleteCustomer(String dni);

    void getCustomers(String entityName);


}
