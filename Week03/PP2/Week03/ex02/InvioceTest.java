public class InvioceTest {
    public static void main (String[] args) {
    
    invoice data1 = new invoice("707", "engine", 2, 15000);
    invoice data2 = new invoice("650", "tyre", 8, 1250);
    
    System.out.println(data1.getInvoiceAmount());
    System.out.println(data2.getInvoiceAmount());

 }

}