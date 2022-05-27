package Models.Users;

import java.util.Date;

/**
 * <h2>Employee</h2>
 * {@code Employee} is a subclass<br>
 * <p>
 * This class belong to the group User of system.<br>
 * This class extends of {@User} *
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */

public class Employee extends User {
    private Integer personalFile;


    public Employee(String cuil, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer branchId, Integer personalFile) {
        super(cuil, name, surname, address, phoneNumber, email, registrationDate, branchId);
        this.personalFile = personalFile;
    }

    public Integer getPersonalFile() {
        return personalFile;
    }

    public void setPersonalFile(Integer personalFile) {
        this.personalFile = personalFile;
    }
}



