import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInvoices = sc.nextInt();
        sc.nextLine();
        // create an array to store invoices
        Invoice[] invoices = new Invoice[numInvoices];

        // get details for each invoice
        for (int i = 0; i < numInvoices; i++) {
            System.out.printf("Enter details for invoice %d:%n", i + 1);

            // get customer name
            String customerName = sc.nextLine();

            String invoiceNumber = sc.nextLine();

            int numItems = sc.nextInt();
            sc.nextLine(); // consume the newline character

            // create an array to store invoice items
            InvoiceItem[] items = new InvoiceItem[numItems];

            // get details for each item
            for (int j = 0; j < numItems; j++) {
                System.out.printf("Enter details for item %d:%n", j + 1);
                String description = sc.nextLine();
                int quantity = sc.nextInt();
                double price = sc.nextDouble();
                sc.nextLine();
                InvoiceItem item = new InvoiceItem(description, quantity, price);
                items[j] = item;
            }

            Invoice invoice = new Invoice(customerName, invoiceNumber, items);
            invoices[i] = invoice;
        }

        // calculate and print the amount per invoice item for each invoice
        for (int i = 0; i < numInvoices; i++) {
            Invoice invoice = invoices[i];
            double amountPerItem = invoice.getInvoiceAmount() / invoice.getNumItems();
            System.out.printf("Amount per item for invoice %d: $%.2f%n", i + 1, amountPerItem):
        }
    }
}
