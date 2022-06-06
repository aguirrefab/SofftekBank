package models.users;

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
    private Integer personalFileId;


    public EmployeeBank(String dni, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer personalFileId) {
        super(dni, name, surname, address, phoneNumber, email, registrationDate);
        this.personalFileId = personalFileId;
    }

    public Integer getPersonalFile() {
        return personalFileId;
    }

    public void setPersonalFileId(Integer personalFileId) {
        this.personalFileId = personalFileId;
    }


    @Override
    public String toString() {
        return "EmployeeBank{" +
                "Personal File=" + personalFileId +
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



