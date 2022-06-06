package models.accounts;

import models.users.Customer;

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

    public CheckingAccount(Integer idAccount, Double balance, Long CBU, String tipeOfCurrency, String tipeOfAccount, Customer customerDni) {
        super(idAccount, balance, CBU, tipeOfCurrency, tipeOfAccount, customerDni);
    }

    public CheckingAccount(){};
}
