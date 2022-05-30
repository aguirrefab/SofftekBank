package DAO;

import Models.Accounts.Account;

import java.util.List;

public class AccountDAO  implements IAccountDAO{
    @Override
    public void addAccount(Account account, String dni) {

    }

    @Override
    public List<Account> getAccountsOfCustomer(String dni) {
        return null;
    }

    @Override
    public List<Account> getAccountsByBank(Integer entityCode) {
        return null;
    }
}
