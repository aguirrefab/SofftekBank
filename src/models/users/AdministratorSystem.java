package models.users;

import java.util.Date;

public class AdministratorSystem extends User {
    private final String COMPANY;

    public AdministratorSystem(String dni, String name, String surname, String address, String phoneNumber, String email, Date registrationDate, String COMPANY) {
        super(dni, name, surname, address, phoneNumber, email, registrationDate);
        this.COMPANY = COMPANY;
    }

    @Override
    public String toString() {
        return "AdministratorSystem{" +
                "Company='" + COMPANY + '\'' +
                ", dni='" + dni + '\'' +
                ", Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Address='" + address + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}




