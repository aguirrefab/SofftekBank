package models.accounts;

import constants.TypeOfAccount;
import constants.TypeOfCurrency;
import dao.AccountDAO;

import java.util.ArrayList;

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

    protected String tipeOfCurrency;

    protected String tipeOfAccount;

    protected String customerDni;




    public Account(Integer idAccount, Double balance, Long CBU, String tipeOfCurrency, String tipeOfAccount, String customerDni) {
        this.idAccount = idAccount;
        this.balance = balance;
        this.CBU = CBU;
        this.tipeOfCurrency = tipeOfCurrency;
        this.tipeOfAccount = tipeOfAccount;
        this.customerDni = customerDni;    }

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

    public void setCBU(long CBU) {
        this.CBU = CBU;
    }

    public String getTipeOfCurrency() {
        return tipeOfCurrency;
    }

    public void setTipeOfCurrency(String tipeOfCurrency) {
        this.tipeOfCurrency = tipeOfCurrency;
    }

    public String getTipeOfAccount() {
        return tipeOfAccount;
    }

    public void setTipeOfAccount(String tipeOfAccount) {
        this.tipeOfAccount = tipeOfAccount;
    }

    public String getCustomerDni() {
        return customerDni;
    }

    public void setCustomerDni(String customerDni) {
        this.customerDni = customerDni;
    }
}
