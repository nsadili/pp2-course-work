public class InvoiceTest {
    public static void main(String[] args) {
       Invoice invoice = new Invoice("1234", "Screwdriver", 10, 5.5);
       System.out.println("Part Number: " + invoice.getPartNumber());
       System.out.println("Part Description: " + invoice.getPartDescription());
       System.out.println("Quantity: " + invoice.getQuantity());
       System.out.println("Price per Item: " + invoice.getPricePerItem());
       System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
 }
 