package dao;

import models.accounts.Account;

import java.util.List;


public interface IAccountDAO {

    void addAccount(Account account);
    void deleteSavingAccount(Account account);
    Account findAccountByCBU(Long CBU);
    List<Account> findAccountByDNI(Integer DNI);
    List<Account> listAccountByBankEntityCode(Integer entityCode);
    List<Account> listAccountByBranchId(Integer entityId);

    void depositInSavingAccount(Account account, double quantity);

    void extractFromSavingAccount(Account account, double quantity);

    void transferToSavingAccount(Account accountOrigin, Account accountDestiny, double quantity);

    void depositInCheckingAccount(Account account, double quantity);

    void extractFromCheckingAccount(Account account, double quantity);

    void transferToCheckingAccount(Account accountOrigin, Account accountDestiny, double quantity);

}
