package PW4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account account = new Account();

        do {
            try {
                System.out.print("What is your balance? ");
                account.setBalance(scan.nextDouble());
                System.out.print("How much money do you want to withdraw? ");
                account.withdraw(scan.nextDouble());
                System.out.printf("The amount of money you have: %.2f\n", account.getBalance());
            } catch (InvalidAmountException e) {
                System.out.print("The amount you want to withdraw exceeds the balance!");
                e.printStackTrace();
            }
        } while (true);
    }    
}