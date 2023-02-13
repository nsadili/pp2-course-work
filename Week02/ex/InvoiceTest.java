public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("100", "PhotoOperator", 1.958);
        System.out.println(invoice.getPartNumber());
        System.out.println(invoice.getPartDescription());
        System.out.println(invoice.getQuantity());
        System.out.println(invoice.getPricePerItem());
        System.out.println(invoice.getInvoiceAmount());

    }
}