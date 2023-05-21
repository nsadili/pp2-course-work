import pp2.week03.ex02.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("12345", "Widget", 5, 9.99);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }

    @Override
    public String toString() {
        return "InvoiceTest []";
    }
}