package dao;

import models.users.Customer;


public interface ICustomerDAO extends DAO<Customer>{

    Customer findCustomersByDni(Integer DNI);

    //List<Customer> listCustomersByBankEntityCode(Integer entityCode);

    //List<Customer> listCustomersBySubsidiaryId(Integer entityId);


}



