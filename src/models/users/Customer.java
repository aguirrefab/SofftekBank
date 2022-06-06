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
    private Integer branchId;

    public Customer() {}

    public Customer(Integer dni, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer customerId, Integer branchId) {
        super(dni, name, surname, address, phoneNumber, email, registrationDate);
        this.branchId = branchId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}

