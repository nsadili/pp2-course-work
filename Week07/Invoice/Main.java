package Invoice;
public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice(5, 10.0);
            System.out.println("Total price: " + invoice.calculateTotal());

            invoice.setQuantity(-3);
            invoice.setPrice(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
