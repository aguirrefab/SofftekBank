package main;

import models.banks.Bank;
import services.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SofttekSystemBank {



    public static void main(String[] args) {

        ICustomerService customerService = new CustomerService();
        IEmployeeService employeeService = new EmployeeService();
        IBranchService branchService = new BranchService();
        IAccountService accountService = new AccountService();
        IBankService bankService = new BankService();

        showPrincipalPanel();

    }
    public static void showPrincipalPanel(){
        int attemps = 0;
        int response = 0;
        do {

            System.out.println("---- Welcome to Softtek System Bank ----");
            System.out.println("****************************************");

            System.out.println("---- Please select a option to login ----");
            System.out.println("(1) Login like Employee Bank");
            System.out.println("(2) Login like Customer");
            System.out.println("(0) To close the program");
            System.out.print("Your response: ");

            try {
                Scanner sc = new Scanner(System.in);
                response = sc.nextInt();

                switch (response){
                    case 1:
                        showEmployeeMenu();
                        break;
                    case 2:
                        showCustomerMenu();;
                        break;
                    case 0:
                        System.out.println("Thank you for you visit");
                        break;
                    default:
                        System.out.println("Please select a correct answer.");
                        System.out.println("-----------------------------------");
                        System.out.println("Remaining login attemps: " + (3 - attemps));
                        System.out.println("-----------------------------------");
                        System.out.println();
                }
            } catch (InputMismatchException exInput){
                System.out.println("You need enter a valid option (1 | 2 | 0)");
            } attemps += 1;

        }while (response != 0 && attemps <= 3);
        if (response == 0 || attemps >= 3){
            System.out.println("-----------------------------------");
            System.out.println("Sorry, unable to access the system.");
        }
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

//        try {
//            Scanner sc = new Scanner(System.in);
//            int optionEmployeeMenu = sc.nextInt();
//
//
//            }
//        } catch (InputMismatchException exOption){
//            System.out.println("Please, enter the valid value for the option.")
//        }
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
