package Models;
import java.util.Date;
import java.util.List;

/**
 * <h2>Customer</h2>
 * {@code Customer} is a subclass<br>
 * <p>
 * This class belong to the group User of system.<br>
 * This class extends of {@User} *
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */

public class Customer extends User{

    private Integer id;
    private List<Account> accounts;

    public Customer(String cuil, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer branchId, Integer id, List<Account> accounts) {
        super(cuil, name, surname, address, phoneNumber, email, registrationDate, branchId);
        this.id = id;
        this.accounts = accounts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}

