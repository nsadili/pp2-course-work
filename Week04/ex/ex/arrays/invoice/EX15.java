package ex.arrays.invoice;
import java.util.Scanner;

public class EX15 {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of invoices: ");
            int numInvoices = scan.nextInt();
            
            Invoice[] invoices = new Invoice[numInvoices];
            
   
            for (int i = 0; i < numInvoices; i++) {
                System.out.println("\nInvoice " + (i+1));
                
               
                System.out.print("Enter invoice number: ");
                String invoiceNumber = scan.next();
                
                
                System.out.print("Enter invoice description: ");
                String invoiceDesc = scan.next();
                
               
                System.out.print("Enter quantity: ");
                int quantity = scan.nextInt();
                
                
                System.out.print("Enter price: ");
                double price = scan.nextDouble();
                
                
                invoices[i] = new Invoice(invoiceNumber, invoiceDesc, quantity, price);
            }
            
            System.out.println("\nInvoice amounts:");
            for (int i = 0; i < numInvoices; i++) {
                System.out.println(invoices[i].getInvoiceNumber() + ": " + invoices[i].getInvoiceAmount());
            }
        }
    }
}