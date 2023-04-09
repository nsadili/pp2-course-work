import java.util.Scanner;

public class ArrayOfInvoices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfInvoices;

        System.out.println("Enter the number of invoices: ");
        numOfInvoices = scanner.nextInt();

        // Create an array of Invoice objects with the given number of invoices
        Invoice[] invoices = new Invoice[numOfInvoices];

        // Loop through each invoice to get user input and calculate invoice amount
        for (int i = 0; i < numOfInvoices; i++) {
            scanner.nextLine(); // Clear the scanner buffer
            System.out.println("\nInvoice #" + (i + 1));

            // Get input from user for invoice attributes
            System.out.print("Enter the invoice number: ");
            String invoiceNum = scanner.nextLine();

            System.out.print("Enter the customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter the quantity of items: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter the price per item: ");
            double pricePerItem = scanner.nextDouble();

            // Create the Invoice object with the given attributes
            invoices[i] = new Invoice(invoiceNum, customerName, quantity, pricePerItem);

            // Calculate and print the invoice amount for the current invoice
            System.out.println("Invoice Amount: " + invoices[i].getInvoiceAmount());
        }

        scanner.close(); // Close the scanner
    }
}

class Invoice {
    private String invoiceNumber;
    private String customerName;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String invoiceNumber, String customerName, int quantity, double pricePerItem) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Getters and setters for each attribute
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    // Method to calculate the invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}