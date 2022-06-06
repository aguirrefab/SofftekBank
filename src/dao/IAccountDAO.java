package dao;

import models.accounts.Account;

import java.util.List;


public interface IAccountDAO {

    Account findAccountByCBU(Long CBU);

    List<Account> findAccountByDNI(Integer DNI);

    void updateSavingAccountBalance(Account account);
    void updateCheckingAccountBalance(Account account);
    List<Account> listAccountByBankEntityCode(Integer entityCode);
    List<Account> listAccountByBranchId(Integer idSubsidiary);

}
