package Week07.pw4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account account = new Account();
        try {
            System.out.print("Set your balance");
            account.setBalance(scan.nextDouble());
            System.out.print("Write withdraw amount");
            account.withdraw(scan.nextDouble());
            System.out.printf("Your balance: %.2f\n", account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.print("The amount you want to withdraw exceeds the balance.");
            e.printStackTrace();
        }
        scan.close();
    }
}