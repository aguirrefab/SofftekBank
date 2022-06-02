package models.Accounts;

/**
 * <h2>Saving Account</h2>
 * {@code Account} is a subclass<br>
 * <p>
 * This class belong to the group Account of system.<br>
 * This class extends of {@Account}
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */

public abstract class SavingAccount extends Account {
    private String currency;

    public SavingAccount(Integer idAccount, Double balance, String currency) {
        super(idAccount, balance);
        this.currency = currency;    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


}
