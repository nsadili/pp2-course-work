import java.util.Scanner;

import pp2.week03.ex02.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Invoice invoice = new Invoice("9084278", "Book", 4, 15.0);
        
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
        
        System.out.println("Enter a new quantity: ");
        int newQuantity = input.nextInt();
        invoice.setQuantity(newQuantity);
        System.out.println("New Quantity: " + invoice.getQuantity());
        System.out.println("New Invoice Amount: $" + invoice.getInvoiceAmount());
        
        input.close();
    }
}
