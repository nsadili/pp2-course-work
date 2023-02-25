import week03.ex02.Invoice;
import java.util.Scanner;
/*
    Check out toString() method in Invoice.java
    The rest is simple to implement: create an array, assign objects using constructor
 */
public class Task15Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
