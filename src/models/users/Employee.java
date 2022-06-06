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

public class Employee extends User {
    private Integer personalFileId;
    private Double salary;
    private String jobRole;
    private Integer branchId;

    public Employee(){};

    public Employee(Integer dni, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, Integer personalFileId, Double salary, String jobRole, Integer branchId) {
        super(dni, name, surname, address, phoneNumber, email, registrationDate);
        this.personalFileId = personalFileId;
        this.salary = salary;
        this.jobRole = jobRole;
        this.branchId = branchId;
    }

    public Integer getPersonalFileId() {
        return personalFileId;
    }

    public void setPersonalFileId(Integer personalFileId) {
        this.personalFileId = personalFileId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }


    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}



