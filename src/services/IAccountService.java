package services;

import models.accounts.Account;

import java.util.List;

public interface IAccountService {

    void addAccount(Account account);

    double getAccountBalance(Account account);

    List<Account> listAccountByDni(String dni);

    Account findAccountByDni(String dni);

    void depositInAccount(Account account, Double quantity);

    void transacctionBetweenAccounts(Account account, Long CBU, Double quantitu);






}
