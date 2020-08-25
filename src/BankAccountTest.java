import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;
    private static int count;

    public static void beforeClass(){
        System.out.println("This executes before any test. Count = " + count++);
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("John Smith", 1050.50, BankAccount.CHECKINGS);
        System.out.println("Running a test....");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200);
        assertEquals(1250.50, balance, 0);
    }

    @org.junit.Test
    public void getBalance() {
        account.deposit(500);
        assertEquals(1550.50, account.getBalance(), 0);
    }


}
