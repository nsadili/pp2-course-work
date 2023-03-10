package AccountClass;

import AccountClass.Account;
import AccountClass.customer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        customer elnar = new customer(16260, "Elnar", 'm');
        Account account = new Account(5453, elnar, 10);
        System.out.println("Enter withdrawal amount : ");
        try {
            int s = scan.nextInt();
            account.withdraw(s);
        } catch (Exception m) {
            System.out.println("Error :" + m.toString());
        } finally {
            System.out.println(account.toString());
        }
    }
}