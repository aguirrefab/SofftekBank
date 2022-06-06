package main;

import java.util.Scanner;

public class SofttekSystemBank {

    public static void main(String[] args) {
        showPrincipalPanel();

    }
    public static void showPrincipalPanel(){

        int response = 0;
        do {
            System.out.println("---- Welcome to Softtek System Bank ----");
            System.out.println("****************************************");

            System.out.println("---- Please select a option to login ----");
            System.out.println("(1) Login like Employee Bank");
            System.out.println("(2) Login like Costumer");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response){
                case 1:
                    response = 0;
                    showEmployeeMenu();
                    break;
                case 2:
                    response = 0;
                    showCustomerMenu();;
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void showEmployeeMenu(){

        System.out.println("////// Your session: Employee //////////");
        System.out.println("---- Welcome to Softtek System Bank ----");
        System.out.println("****************************************");
        System.out.println("Please, select options to operate:      ");
        System.out.println("(1) Create Bank");
        System.out.println("(2) Create Customer");
        System.out.println("(3) Create Employee");
        System.out.println("(4) Create Accounts");
        System.out.println("(5) List Customers by Bank");
        System.out.println("(6) List Customers by Branch");
        System.out.println("(7) List Customers by Bank");
        System.out.println("(6) Find Customers by DNI");
        System.out.println("(7) Find Employee by DNI");
    }

    public static void showCustomerMenu(){

        System.out.println("//////// Your session: Customer ////////");
        System.out.println("---- Welcome to Softtek System Bank ----");
        System.out.println("****************************************");
        System.out.println("Please, select options to operate: ");
        System.out.println("(1) Consult your Accounts");
        System.out.println("(2) Deposit Money");
        System.out.println("(3) Extract Money");
        System.out.println("(4) Transfer Money");
        System.out.println("****************************************");

    }

}
