package ex;

import java.util.Scanner;
import pp2.week03.Invoice;

public class InvoiceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of invoices: ");
        int numInvoices = input.nextInt();
        input.nextLine(); // consume newline character

        Invoice[] invoices = new Invoice[numInvoices];

        for (int i = 0; i < numInvoices; i++) {
            System.out.println("Enter invoice #" + (i + 1) + " details:");
            System.out.print("Part number: ");
            String partNumber = input.nextLine();
            System.out.print("Part description: ");
            String partDescription = input.nextLine();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            System.out.print("Price per item: ");
            double pricePerItem = input.nextDouble();
            input.nextLine(); // consume newline character

            invoices[i] = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }
        input.close();

        System.out.println("\nInvoice details:");
        for (int i = 0; i < numInvoices; i++) {
            System.out.println("Invoice #" + (i + 1) + ":");
            System.out.println("Part number: " + invoices[i].getPartNumber());
            System.out.println("Part description: " + invoices[i].getPartDescription());
            System.out.println("Quantity: " + invoices[i].getQuantity());
            System.out.println("Price per item: " + invoices[i].getPricePerItem());
            System.out.println("Invoice amount: " + invoices[i].getInvoiceAmount());
            System.out.println();
        }
    }

    
}
