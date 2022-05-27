package Models.Accounts;

import Models.Accounts.Account;

public abstract class SavingAccount extends Account {
    private String currency;

    public SavingAccount(Integer idAccount, Double balance, String currency) {
        super(idAccount, balance);
        this.currency = currency;
    }
<<<<<<< HEAD

=======
    
>>>>>>> dfadc631512d27326d48d23f36c81af043f73699
    @Override
    public void deposit(double quantity) {
    }
    @Override
    public void extract(double quantity) {
    }
}
