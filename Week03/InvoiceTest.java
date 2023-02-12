public class InvoiceTest {
    public static void main(String[] args) {
       Invoice invoice = new Invoice("12", "Abcd", 100, 20.0);
       System.out.println("Number: " + invoice.getNumber());
       System.out.println("Description: " + invoice.getDescription());
       System.out.println("Quantity: " + invoice.getQuantity());
       System.out.println("Price: " + invoice.getPrice());
       System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
 }