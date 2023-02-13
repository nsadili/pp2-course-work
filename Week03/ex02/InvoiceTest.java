package Week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("5555", "Hummer", 5, 10.0);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getItemQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
