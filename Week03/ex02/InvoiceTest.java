package Week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice first = new Invoice("partNumber1", "Desc1", -5, 40.5);
        Invoice second = new Invoice("partNumber2", "Desc2", 10, 10.1);

        System.out.println("First invoice details: ");
        System.out.println("Part Number: " + first.getPartNumber());
        System.out.println("Part Description: " + first.getPartDescription());
        System.out.println("Quantity: " + first.getQuantity());
        System.out.println("Price Per Item: " + first.getPricePerItem());
        System.out.println("Invoice amount: " + first.getInvoiceAmount());

        System.out.println();

        System.out.println("Second invoice details: ");
        System.out.println("Part Number: " + second.getPartNumber());
        System.out.println("Part Description: " + second.getPartDescription());
        System.out.println("Quantity: " + second.getQuantity());
        System.out.println("Price Per Item: " + second.getPricePerItem());
        System.out.println("Invoice amount: " + second.getInvoiceAmount());
    }
}
