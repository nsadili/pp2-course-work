
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("001", "Hammer", 2, 25.0);
        Invoice invoice2 = new Invoice("002", "Screwdriver", -1, -10.0);

        System.out.println("Invoice 1:");
        System.out.println("Part number: " + invoice1.getPartNumber());
        System.out.println("Part description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per item: " + invoice1.getPricePerItem());
        System.out.println("Invoice amount: " + invoice1.getInvoiceAmount());

        System.out.println();

        System.out.println("Invoice 2:");
        System.out.println("Part number: " + invoice2.getPartNumber());
        System.out.println("Part description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per item: " + invoice2.getPricePerItem());
        System.out.println("Invoice amount: " + invoice2.getInvoiceAmount());
    }
}
