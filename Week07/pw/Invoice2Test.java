public class Invoice2Test {
    public static void main(String[] args) {
        try {
            Invoice2 invoice = new Invoice2("PN001", "Product 1", 5, -10.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
