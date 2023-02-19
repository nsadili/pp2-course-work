import java.util.Scanner;

public class Invoice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the number of invoices: ");
        int numInvoices = scanner.nextInt();
    
        Invoice[] invoices = new Invoice[numInvoices];
        
      
        for (int i = 0; i < numInvoices; i++) {
            System.out.println("Enter information for invoice #" + (i+1) + ":");
            System.out.print("Invoice number: ");
            int invoiceNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Number of items: ");
            int numItems = scanner.nextInt();
            scanner.nextLine();
            
            String[] items = new String[numItems];
            int[] quantities = new int[numItems];
            double[] prices = new double[numItems];
            
            for (int j = 0; j < numItems; j++) {
                System.out.println("Enter information for item #" + (j+1) + ":");
                System.out.print("Item name: ");
                items[j] = scanner.nextLine();
                System.out.print("Quantity: ");
                quantities[j] = scanner.nextInt();
                System.out.print("Price: ");
                prices[j] = scanner.nextDouble();
                scanner.nextLine();
            }
            
            invoices[i] = new Invoice(invoiceNumber, customerName, items, quantities, prices);
        }
        
        
        for (Invoice invoice : invoices) {
            System.out.println("Invoice #" + invoice.getInvoiceNumber() + " amount: $" + invoice.getInvoiceAmount());
        }
        
        scanner.close();
    }
}

 public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private String[] items;
    private int[] quantities;
    private double[] prices;
    
    public Invoice(int invoiceNumber, String customerName, String[] items, int[] quantities, double[] prices) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.items = items;
        this.quantities = quantities;
        this.prices = prices;
    }
    
    public int getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public double getInvoiceAmount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += quantities[i] * prices[i];
        }
        return total;
    }
}
