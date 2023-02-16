import geometry.Invoice;

public class invoicetest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("123", "burger", 5, 10.0);
        System.out.println("Part Number: " + invoice.PartNumber());
        System.out.println("Part Description: " + invoice.PartDescription());
        System.out.println("Quantity: " + invoice.Quantity());
        System.out.println("Price per Item: " + invoice.PricePerItem());
        System.out.println("Invoice Amount: " + invoice.InvoiceAmount());
    }
}
