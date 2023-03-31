import java.util.Scanner;

public class InvoiceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of invoices: ");
        int numOfInvoices = scanner.nextInt();

        Invoice[] invoices = new Invoice[numOfInvoices];

        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println("Enter details for Invoice #" + (i+1));

            System.out.print("Invoice Number: ");
            int invoiceNum = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Invoice Description: ");
            String description = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per Item: ");
            double pricePerItem = scanner.nextDouble();

            invoices[i] = new Invoice(invoiceNum, description, quantity, pricePerItem);
        }

        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println("Invoice #" + (i+1) + " Amount per Item: $" + invoices[i].getInvoiceAmount());
        }
    }
}
