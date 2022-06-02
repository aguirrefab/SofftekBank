package models.users;
import models.accounts.Account;

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


    public Customer(String dni, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer branchId, Integer id, List<Account> accounts) {
        super(dni, name, surname, address, phoneNumber, email);

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

