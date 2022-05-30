package Models.Users;

import java.util.Date;

/**
 * <h2>User</h2>
 * {@code User} is a abstract class<br>
 * <p>
 * This class is the superclass for the group Users. <br>
 * Create instance is not possible from this class.. *
 * <p>
 *
 * @author AguirreFab
 * @version 1.0
 */

public abstract class User {
    protected String dni;
    protected String name;
    protected String surname;    protected String address;
    protected String phoneNumber;
    protected String email;
    protected Date registrationDate;


    public User(String dni, String name, String surname, String address, String phoneNumber, String email) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCuil() {
        return dni;
    }

    public void setCuil(String cuil) {
        this.dni = cuil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

}

