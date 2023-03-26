package Bank;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();

        try {
            account1.withdraw(amount);
            System.out.println("Transaction successful");
            System.out.println(account1);
        } catch (InvalidAmountException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}