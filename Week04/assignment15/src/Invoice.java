import java.util.Scanner;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }

    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %d%n%s: $%.2f",
                "Part Number", partNumber, "Part Description", partDescription,
                "Quantity", quantity, "Price per item", price);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of invoices: ");
            int numOfInvoices = input.nextInt();

            Invoice[] invoices = new Invoice[numOfInvoices];

            for (int i = 0; i < numOfInvoices; i++) {
                System.out.printf("Enter details for invoice %d:%n", i + 1);
                System.out.print("Enter part number: ");
                String partNumber = input.next();
                System.out.print("Enter part description: ");
                String partDescription = input.next();
                System.out.print("Enter quantity: ");
                int quantity = input.nextInt();
                System.out.print("Enter price per item: ");
                double price = input.nextDouble();

                invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
            }

            System.out.println("Invoice details:");
            for (int i = 0; i < numOfInvoices; i++) {
                System.out.printf("Invoice %d:%n%s%n%s: $%.2f%n%n", i + 1,
                        invoices[i], "Invoice Amount", invoices[i].getInvoiceAmount());
            }
        }
    }
}
