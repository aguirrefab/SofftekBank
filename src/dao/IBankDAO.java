package dao;

import models.accounts.Account;
import models.banks.Bank;

public interface IBankDAO extends DAO<Bank>{

    Bank findBankByEntityCode(Integer entityCode);

    void updateBankEntity(Integer entityCode);


}
