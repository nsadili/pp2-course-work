public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("123", "Phone", 3, 672.0);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getquantity());
        System.out.println("Price: " + invoice.getprice());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
