package Models.Accounts;

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
