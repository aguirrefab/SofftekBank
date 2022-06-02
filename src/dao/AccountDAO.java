package dao;

import models.accounts.Account;
import models.database.DBConnection;

import java.sql.Connection;
import java.util.List;

public class AccountDAO  implements IAccountDAO{

    Connection connectionDB = DBConnection.getConnection();

    private List<Account> accounts;

    public AccountDAO(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void add(Account account) {

    }

    @Override
    public void delete(Account dni) {

    }

    @Override
    public void modify(Account customer) {

    }

    @Override
    public Account findById(Integer String) {
        return null;
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
