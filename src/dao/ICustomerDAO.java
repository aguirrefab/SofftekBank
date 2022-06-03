package dao;

import models.users.Customer;

import java.util.List;


public interface ICustomerDAO extends DAO<Customer>{

    List<Customer> findCustomersByDni(String dni);

    //List<Customer> listCustomersByBankEntityCode(Integer entityCode);

    //List<Customer> listCustomersBySubsidiaryId(Integer entityId);


}



