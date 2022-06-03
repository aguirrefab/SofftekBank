package dao;

import models.accounts.Account;
import models.database.IDBConnection;

import java.sql.Connection;
import java.util.List;


public interface IAccountDAO extends DAO<Account> {

    Account findAccountByCBU(Long CBU);

    Account findAccountByDNI(String DNI);


    Integer updateAccountBalance(Account account);


    List<Account> listAccountByBankEntityCode(Integer entityCode);
    List<Account> listAccountBySubsidiaryId(Integer idSubsidiary);


}
