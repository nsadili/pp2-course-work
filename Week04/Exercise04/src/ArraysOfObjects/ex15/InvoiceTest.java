package ArraysOfObjects.ex15;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        String n = "5233";
        
        Invoice mikser = new Invoice("6574", "Made in China.", 7, 39.99);
        mikser.setNumber(n);

        Scanner scan = new Scanner(System.in);

        Invoice invoices[] = new Invoice[3];
        for (int i = 0; i < invoices.length; i++) {
            int quantity = scan.nextInt();
            double price = scan.nextDouble();
            invoices[i] = new Invoice(null, null, quantity, price);
        }
        for (Invoice x: invoices) {
            System.out.println(x.getInvoiceAmount());
        }
        
        System.out.println("Number: " + mikser.getNumber());
        System.out.println("Description: " + mikser.getDescription());
        System.out.println("Quantity: " + mikser.getAmount());
        System.out.println("Price: " + mikser.getPrice());
        System.out.println("Invoice Amount: " + mikser.getInvoiceAmount());
    }
}
