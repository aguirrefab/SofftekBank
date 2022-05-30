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

public class EmployeeBank extends User {
    private Integer personalFile;


    public EmployeeBank(String dni, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer branchId, Integer personalFile) {
        super(dni, name, surname, address, phoneNumber, email);
        this.personalFile = personalFile;
    }

    public Integer getPersonalFile() {
        return personalFile;
    }

    public void setPersonalFile(Integer personalFile) {
        this.personalFile = personalFile;
    }


    @Override
    public String toString() {
        return "EmployeeBank{" +
                "Personal File=" + personalFile +
                ", cuil='" + dni + '\'' +
                ", Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Address='" + address + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                ", Email='" + email + '\'' +
                ", RegistrationDate=" + registrationDate +
                '}';
    }
}



