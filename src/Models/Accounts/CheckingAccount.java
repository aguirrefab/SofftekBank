package Models.Accounts;

import Models.Accounts.Account;

/**
 * <h2>Checking Account</h2>
 * {@code Account} is a subclass<br>
 * <p>
 * This class belong to the group Account of system.<br>
 * This class extends of {@Account}
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */

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
