package Models.Accounts;

import Models.Accounts.Account;

public class CheckingAccount extends Account {
    private String currency;

    public CheckingAccount(Integer idAccount, Double balance, String currency) {
        super(idAccount, balance);
        this.currency = currency;
    }

    @Override
    public void deposit(double quantity) {
    }
    @Override
    public void extract(double quantity) {
    }
}
