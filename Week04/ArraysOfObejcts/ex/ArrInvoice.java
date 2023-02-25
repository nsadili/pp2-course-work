import java.util.Scanner;

import Week03.InvoiceEx.Invoice;
public class ArrInvoice {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("n = ");
            int n = scanner.nextInt();
            Invoice[] invoices = new Invoice[n];
            for(int i=0;i<n;i++) {
                System.out.println("- - - - - - - - - - - -");
                System.out.println("Product number = " + i);
                System.out.print("Description: ");
                String description = scanner.next();
                System.out.print("Quantity: ");
                int quantitiy = scanner.nextInt();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                invoices[i] = new Invoice(String.valueOf(i),description,quantitiy,price);
            }
            for(int i=0;i<invoices.length;i++) {
                System.out.println(invoices[i].toString());
            }
        }
    }
}
