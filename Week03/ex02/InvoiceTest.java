package ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(null, null, 0, 0);
    
    System.out.println(invoice.getPartNumber());
    System.out.println(invoice.getPartDescription());
    System.out.println(invoice.getQuantity());
    System.out.println(invoice.getPricePerItem());
    System.out.println(invoice.getInvoiceAmount());
    }
}