package Services;

import Models.Accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService {

    private List<Account> accounts;

    public AccountService(List<Account> accounts) {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void deposit(double quantity) {

    }

    @Override
    public void extract(double quantity) {

    }
}
