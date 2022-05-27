package Models.Accounts;


/**
 * <h2>Account</h2>
 * {@code Account} is a abstract class<br>
 * <p>
 * This class is the superclass for the group Account.<br>
 * Not is possible create instance from this class.
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */
public abstract class Account {
    private Integer idAccount;
    private Double balance;


    public Account(Integer idAccount, Double balance) {
        this.idAccount = idAccount;
        this.balance = balance;
    }

    public abstract void deposit(double quantity);
    public abstract void extract(double quantity);
}
