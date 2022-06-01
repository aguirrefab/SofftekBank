package dao;

import models.Accounts.Account;

import java.util.List;

public interface IAccountDAO {

    void addAccount(Account account, String dni);

    List<Account> getAccountsOfCustomer(String dni);

    List<Account> getAccountsByBank(Integer entityCode);
}
