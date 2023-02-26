import java.util.Scanner;

public class ArrOfInvoices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of invoices: ");
        int numInvoices = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 1; i <= numInvoices; i++) {
            System.out.println("Enter information for invoice #" + i);
            System.out.print("Customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Invoice number: ");
            String invoiceNumber = scanner.nextLine();
            System.out.print("Invoice date (YYYY-MM-DD): ");
            String invoiceDate = scanner.nextLine();
            System.out.print("Number of items: ");
            int numItems = scanner.nextInt();
            scanner.nextLine(); 
            
            Invoice invoice = new Invoice(customerName, invoiceNumber, invoiceDate);
            
            for (int j = 1; j <= numItems; j++) {
                System.out.println("Enter information for invoice item #" + j);
                System.out.print("Description: ");
                String description = scanner.nextLine();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Unit price: ");
                double unitPrice = scanner.nextDouble();

                InvoiceItem item = new InvoiceItem(description, quantity, unitPrice);
                invoice.addItem(item);
            }
            
            System.out.println("Invoice #" + invoice.getInvoiceNumber() + " for " + invoice.getCustomerName() +
                " on " + invoice.getInvoiceDate());
            System.out.println("Item\t\tQuantity\tUnit Price\tAmount");
            for (InvoiceItem item : invoice.getItems()) {
                System.out.printf("%s\t\t%d\t\t%.2f\t\t%.2f\n", item.getDescription(), item.getQuantity(),
                    item.getUnitPrice(), item.getAmount());
            }
            System.out.println("Total:\t\t\t\t\t\t\t" + invoice.getInvoiceAmount());
            System.out.println();
        }
        
        scanner.close();
    }
}
