package Week03.Invoice;

public class Main {
    public static void main(String[] args) {
       Invoice invoice = new Invoice("10268", "Book", 2, 3.2);
       System.out.println("Part number: " + invoice.getPartNumber());
       System.out.println("Part description: " + invoice.getPartDescription());
       System.out.println("Quantity: " + invoice.getQuantity());
       System.out.println("Price per Item: " + invoice.getPricePerItem());
       System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
 }