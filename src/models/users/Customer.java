package models.users;
import models.accounts.Account;
import models.banks.Subsidiary;

import java.util.Date;
import java.util.List;

/**
 * <h2>Customer</h2>
 * {@code Customer} is a subclass<br>
 * <p>
 * This class belong to the group User of system.<br>
 * This class extends of {@User}
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */

public class Customer extends User {

    private Integer subsidiaryId;
    private List<Account> accounts;

    public Customer(String dni, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer subsidiaryId) {
        super(dni, name, surname, address, phoneNumber, email, registrationDate);
        this.subsidiaryId = subsidiaryId;
    }

    public Customer(){}

    public Integer getSubsidiaryId() {
        return subsidiaryId;
    }

    public void setSubsidiaryId(Integer subsidiaryId) {
        this.subsidiaryId = subsidiaryId;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cuil='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}

