import ex02.Invoice;
import java.util.Arrays;
import java.util.Scanner;

public class InvoiceArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter amount of invoices: ");
        int n = scn.nextInt();
        Invoice[] invoices = new Invoice[n];
        for(int i=0; i<n; i++) {
            System.out.println("Invoice " + (i+1));
            System.out.print("Enter part number: ");
            String num = scn.next();
            System.out.print("Enter part description: ");
            String desc = scn.next();
            System.out.print("Enter part amount: ");
            int amount = scn.nextInt();
            System.out.print("Enter part price: ");
            double price = scn.nextDouble();
            Invoice newInvoice = new Invoice(num, desc, amount, price);
            invoices[i] = newInvoice;
            System.out.println("----------------");
        }

        for(int i=0; i < n; i ++) {
            System.out.println(invoices[i]);
        }
    }   

}
