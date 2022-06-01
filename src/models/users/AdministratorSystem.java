package models.users;

public class AdministratorSystem extends User {
    private final String COMPANY;

    public AdministratorSystem(String dni, String name, String surname, String address, String phoneNumber, String email) {
        super(dni, name, surname, address, phoneNumber, email);
        COMPANY = "Softtek";
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




