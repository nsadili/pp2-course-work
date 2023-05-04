import java.util.ArrayList;
import java.util.Collections;
public class AccountDemo {
    public static void main(String[] args) {
        // Create two Account objects
        Account account1 = new Account("John", "Doe", 1000.0);
        Account account2 = new Account("Jane", "Doe", 500.0);

        // Print account information
        System.out.println("Account 1: " + account1);
        System.out.println("Account 2: " + account2);

        // Deposit and withdraw money from accounts
        account1.deposit(500.0);
        account2.withdraw(200.0);

        // Print updated account information
        System.out.println("Account 1 (after deposit): " + account1);
        System.out.println("Account 2 (after withdrawal): " + account2);
    }
}
