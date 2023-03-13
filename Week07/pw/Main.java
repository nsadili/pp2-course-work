public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("Product A", 5, -10.0);
            System.out.println("Total: $" + invoice.getTotal());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
