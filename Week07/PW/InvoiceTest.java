package PW;

public class InvoiceTest {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("INV001", "Product 1", 5, 10.99);
            System.out.println("Total: " + invoice.getTotal());

            // Throws IllegalArgumentException
            invoice.setQuantity(-1);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}