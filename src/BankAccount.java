import java.util.Scanner;

public class BankAccount {

    private double balance;
    private double previousTransaction;
    private String customerName;
    private int accountType;

    public static final int CHECKINGS = 1;
    public static final int SAVINGS = 2;

    public BankAccount(String customerName, double balance, int typeofAccount){
        this.customerName = customerName;
        this.balance = balance;
        this.accountType = typeofAccount;
    }

    public double deposit(double amount){
        if (amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
        return balance;
    }

    public double withdraw(double amount){
        if (amount != 0){
            balance -= amount;
            previousTransaction = amount;
        }
        return balance;
    }

    public void getPreviousTransaction(){
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

    public double getBalance(){
        return balance;
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
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
                    System.out.println("Balance = " + getBalance());
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
