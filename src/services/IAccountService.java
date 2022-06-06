package services;

import models.accounts.Account;

import java.util.List;

public interface IAccountService {

    void addAccount(Account account);
    void deleteSavingAccount(Account account);
    Account findAccountByCBU(Long CBU);
    List<Account> findAccountByDNI(Integer DNI);
    List<Account> listAccountByBankEntityCode(Integer entityCode);
    List<Account> listAccountByBranchId(Integer entityId);

    boolean depositInSavingAccount(Account account, double quantity);

    boolean extractFromSavingAccount(Account account, double quantity);

    boolean transferToSavingAccount(Account accountOrigin, Account accountDestiny, double quantity);

    boolean depositInCheckingAccount(Account account, double quantity);

    boolean extractFromCheckingAccount(Account account, double quantity);

    boolean depositInCheckingAccount(Account accountOrigin, Account accountDestiny, double quantity);

}
