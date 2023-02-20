import pp2.week03.ex02.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("17501", "Nurlan", 7, 3.5);

        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: $" + invoice.getPricePerItem());

        invoice.setPartNumber("6274");
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: $" + invoice.getPricePerItem());

        invoice.setQuantity(8);
        invoice.setPricePerItem(4.5);
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: $" + invoice.getPricePerItem());

        System.out.println("Invoice amount: $" + invoice.getInvoiceAmount());
    }
}
