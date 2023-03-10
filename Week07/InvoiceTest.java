public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("5", "marker", 5, 2.0);
        System.out.println(invoice.getNumber());
        System.out.println(invoice.getDescription());
        System.out.println(invoice.getQuantity());
        System.out.println(invoice.getPrice());
        System.out.println(invoice.getInvoiceAmount());
        
        try {
            Invoice inv = new Invoice("-5", "marker", -100, 20.0);
            System.out.println(inv.getQuantity());
        }
        catch(IllegalArgumentException e) {
            System.out.println("can not be negative number");
        }
        

    
}
}