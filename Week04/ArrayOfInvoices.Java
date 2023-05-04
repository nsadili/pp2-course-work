import java.util.Scanner;

public class InvoiceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get information about each invoice item
        System.out.print("Enter number of items: ");
        int numItems = input.nextInt();
        input.nextLine();

        Invoice[] invoices = new Invoice[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.printf("Enter information for item %d:%n", i + 1);
            System.out.print("Description: ");
            String description = input.nextLine();
            System.out.print("Price per unit: ");
            double price = input.nextDouble();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            input.nextLine();

            invoices[i] = new Invoice(description, price, quantity);
        }
   
        System.out.println("\nInvoice Amount per Item:");
        for (Invoice invoice : invoices) {
            double invoiceAmount = invoice.getQuantity() * invoice.getPrice();
            System.out.printf("%s: $%.2f%n", invoice.getDescription(), invoiceAmount);
        }
    }
}
