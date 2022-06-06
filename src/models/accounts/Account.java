package models.accounts;

import models.banks.Bank;
import models.banks.Branch;
import models.users.Customer;

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
    protected Integer idAccount;
    protected Double balance;
    protected Long CBU;

    protected String typeOfCurrency;

    protected String typeOfAccount;

    protected Customer customer;

    protected Bank bank;

    protected Branch branch;


    public Account(Integer idAccount, Double balance, Long CBU, String typeOfCurrency, String typeOfAccount, Customer customer, Bank bank, Branch branch) {
        this.idAccount = idAccount;
        this.balance = balance;
        this.CBU = CBU;
        this.typeOfCurrency = typeOfCurrency;
        this.typeOfAccount = typeOfAccount;
        this.customer = customer;
        this.bank = bank;
        this.branch = branch;
    }

    public Account(){}

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getCBU() {
        return CBU;
    }

    public void setCBU(Long CBU) {
        this.CBU = CBU;
    }

    public String getTypeOfCurrency() {
        return typeOfCurrency;
    }

    public void setTypeOfCurrency(String typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Account{" +
                "idAccount=" + idAccount +
                ", balance=" + balance +
                ", CBU=" + CBU +
                ", typeOfCurrency='" + typeOfCurrency + '\'' +
                ", typeOfAccount='" + typeOfAccount + '\'' +
                ", customer=" + customer +
                ", bank=" + bank +
                ", branch=" + branch +
                '}';
    }
}
