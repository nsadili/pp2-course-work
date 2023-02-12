package Week03.pp2.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("556", "books", 18, 9.99);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
        }
    }

