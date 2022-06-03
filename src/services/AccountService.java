package services;

import models.accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService {

    private List<Account> accounts;

    public AccountService(List<Account> accounts) {
        this.accounts = new ArrayList<>();
    }


    @Override
    public void addAccount(Account account) {
         
    }

    @Override
    public double getAccountBalance(Account account) {
        return 0;
    }

    @Override
    public List<Account> listAccountByDni(String dni) {
        return null;
    }

    @Override
    public Account findAccountByDni(String dni) {
        return null;
    }

    @Override
    public void depositInAccount(Account account, Double quantity) {

    }

    @Override
    public void transacctionBetweenAccounts(Account account, Long CBU, Double quantitu) {

    }
}
