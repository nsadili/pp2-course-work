package Week07.Invoice;

public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("10268", "Book", -2, 3.2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}