package Models.Accounts;

import Models.Accounts.Account;

public abstract class SavingAccount extends Account {
    private String currency;

    public SavingAccount(Integer idAccount, Double balance, String currency) {
        super(idAccount, balance);
        this.currency = currency;
    }
    @Override
    public void deposit(double quantity) {
    }
    @Override
    public void extract(double quantity) {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
