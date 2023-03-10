package PW1;

public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("001", "Item 1", 5, -10.0);
            System.out.println(invoice.getInvoiceAmount());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
