package EX.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice prod1 = new Invoice("Prod1", "This is a manga 1.", 100, 25.0);
        Invoice prod2 = new Invoice("Prod2", "This is a manga 2.", 67, 15.0);
        System.out.printf("\nPart number: %s\nPart Description: %s\nQuantity: %d\nPrice: %f\n\n", prod1.getNumber(), prod1.getDescription(), prod1.getQuantity(), prod1.getPrice());
        System.out.printf("\nPart number: %s\nPart Description: %s\nQuantity: %d\nPrice: %f\n\n", prod2.getNumber(), prod2.getDescription(), prod2.getQuantity(), prod2.getPrice());
    }
}
