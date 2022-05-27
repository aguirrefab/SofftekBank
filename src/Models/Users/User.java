package Models.Users;

import java.util.Date;

/**
 * <h2>User</h2>
 * {@code User} is a abstract class<br>
 * <p>
 * This class is the superclass for the group Users. <br>
 * Create instance is not possible for this class.. *
 * <p>
 *
 * @author AguirreFab
 * @version 1.0
 */

public abstract class User {
    protected String cuil;
    protected String name;
    protected String surname;
    protected String address;
    protected String phoneNumber;
    protected String email;
    protected Date registrationDate;
    protected Integer branchId;

    public User(String cuil, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer branchId) {
        this.cuil = cuil;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registrationDate = registrationDate;
        this.branchId = branchId;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
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

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}

