package models.banks;

import models.accounts.Account;
import java.util.ArrayList;
import java.util.List;

/**
 * <h2>Bank</h2>
 * {@code Bank} is regular class<br>
 * <p>
 * This class modeling the information for each instance<br>
 * It's possible created objets from this class.
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */

public class Bank {
    private String entityName;
    private Integer entityCode;
    private String country;
    private List<Account> accounts;


    public Bank(String entityName, Integer entityCode, String country) {
        this.entityName = entityName;
        this.entityCode = entityCode;
        this.country = country;
        this.accounts = new ArrayList<>();
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Integer getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(Integer entityCode) {
        this.entityCode = entityCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public void setAccounts(List<Account> accounts){
        this.accounts = accounts;
    }

}
