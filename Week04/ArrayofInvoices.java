import java.util.Scanner;

class Invoice {
    private String itemName;
    private int quantity;
    private double pricePerItem;

    public Invoice(String itemName, int quantity, double pricePerItem) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class ArrayofInvoices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of invoices: ");
        int n = sc.nextInt();
        sc.nextLine();
        Invoice[] invoices = new Invoice[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Invoice " + (i + 1) + ":");
            System.out.println("Item name: ");
            String name = sc.nextLine();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            invoices[i] = new Invoice(name, quantity, price);
        }
        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Invoice " + (i + 1) + " amount: " + invoices[i].getInvoiceAmount());
            total += invoices[i].getInvoiceAmount();
        }
        System.out.println("Total amount: " + total);
    }
}















