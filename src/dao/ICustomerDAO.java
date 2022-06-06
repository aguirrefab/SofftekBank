package dao;

import models.users.Customer;


public interface ICustomerDAO {

    Customer findCustomersByDni(Integer DNI);

    //List<Customer> listCustomersByBankEntityCode(Integer entityCode);

    //List<Customer> listCustomersBySubsidiaryId(Integer entityId);


}



