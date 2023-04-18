package Week04.EX;


import java.util.Scanner;


public class EX15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of invoices: ");
        Invoice[] invoices = new Invoice[sc.nextInt()];
        System.out.println();
        for (int i = 0; i < invoices.length; i++) {
            System.out.println("Invoice #" + (i + 1));
            System.out.print("Enter the quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter the price per item: ");
            double price = sc.nextDouble();
            System.out.println();
            invoices[i] = new Invoice("", "", quantity, price);
        }
        for (int i = 0; i < invoices.length; i++) {
            System.out.println("Invoice #" + (i + 1) + "'s amount: " + invoices[i].getInvoiceAmount());
        }
    }
}
