package models.accounts;

import models.banks.Bank;
import models.banks.Branch;
import models.users.Customer;

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

public class SavingAccount extends Account {

    public SavingAccount(Integer idAccount, Double balance, Long CBU, String typeOfCurrency, String typeOfAccount, Customer customer, Bank bank, Branch branch) {
        super(idAccount, balance, CBU, typeOfCurrency, typeOfAccount, customer, bank, branch);
    }

    public SavingAccount(){}


}
