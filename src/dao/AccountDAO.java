package dao;

import models.Accounts.Account;

import java.util.List;

public class AccountDAO  implements IAccountDAO{

    @Override
    public void add(Account customer) {

    }

    @Override
    public void delete(Account dni) {

    }

    @Override
    public void modify(Account customer) {

    }

    @Override
    public Account findById(String dni) {
        return Customer;
    }

    @Override
    public List<Account> listByBankEntityCode(Integer entityCode) {
        return List<Account>;
    }

    @Override
    public List<Account> listBySubsidiaryId(Integer entityId) {
        return null;
    }
}
