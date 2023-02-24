package Pw09;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please, enter customer ID: ");
        int customerId = sc.nextInt();
        sc.nextLine();
        System.out.print("Please, enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Please, enter customer gender (M/F): ");
        char customerGender = sc.next().charAt(0);

        System.out.print("Please, enter customer discount: ");
        int customerDiscount = sc.nextInt();

        Customer customer = new Customer(customerId, customerName, customerGender, customerDiscount);

        System.out.print("Please, enter account ID: ");
        int accountId = sc.nextInt();

        System.out.print("Please, enter initial account balance: ");
        double accountBalance = sc.nextDouble();

        Account account = new Account(accountId, customer, accountBalance);

        System.out.println(account.toString());

        System.out.print("Please, enter transaction type (D/W): ");
        char transactionType = sc.next().charAt(0);

        System.out.print("Please, enter transaction amount: ");
        double transactionAmount = sc.nextDouble();

        if (transactionType == 'D') {
            account.deposit(transactionAmount);
        } else if (transactionType == 'W') {
            account.withdraw(transactionAmount);
        } else {
            System.out.println("Invalid transaction type.");
        }

        System.out.println(account.toString());

        sc.close();
    }
}
