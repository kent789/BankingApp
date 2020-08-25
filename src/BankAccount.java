import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

    BankAccount(String customerName, String customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }
    void deposit(int amount){
        if (amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if (amount != 0){
            balance = balance - amount;
            previousTransaction = amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0){
            System.out.println("Withdrawn: " + previousTransaction);
        }
        else{
            System.out.println("No transaction occurred");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your personal ID is: " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance ");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("====================================================================");
            System.out.println("Enter an option");
            System.out.println("====================================================================");

            option = scanner.next().toUpperCase().charAt(0);

            System.out.println("\n");

            switch(option){
                case 'A':
                    System.out.println("Balance = " + balance);
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("Enter an amount to deposit");
                    int depositAmount = scanner.nextInt();
                    deposit(depositAmount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("Enter an amount to withdraw");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("Getting previous transaction");
                    getPreviousTransaction();
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Invalid option!! Please enter a valid entry");
                    break;

                case 'E':
                    System.out.println("\n");

            }
        } while (option != 'E');
        System.out.println("Thank you for using this banking service");
    }







}
