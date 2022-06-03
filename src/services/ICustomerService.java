package services;

import models.users.Customer;

import java.util.List;

public interface ICustomerService {

    void addCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer findCustomerByDni(String dni);

//    List<Customer> listCustomersByBankEntityCode(Integer entityCode);
//
//    List<Customer> listCustomersBySubsidiaryId(Integer entityId);

}
