public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("123", "Widget", 2, -5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }
    }
}
