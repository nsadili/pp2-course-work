package pp2.week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice firstInvoice = new Invoice("001", "Description 1", -2, -5.5);

        Invoice secondInvoice = new Invoice("002", "Description 2", 5, 10.0);

        System.out.println("First invoice details:");
        System.out.println("Part number: " + firstInvoice.getPartNumber());
        System.out.println("Part description: " + firstInvoice.getPartDescription());
        System.out.println("Quantity: " + firstInvoice.getQuantity());
        System.out.println("Price per item: " + firstInvoice.getPricePerItem());
        System.out.println("Invoice amount: " + firstInvoice.getInvoiceAmount());

        System.out.println("\nSecond invoice details:");
        System.out.println("Part number: " + secondInvoice.getPartNumber());
        System.out.println("Part description: " + secondInvoice.getPartDescription());
        System.out.println("Quantity: " + secondInvoice.getQuantity());
        System.out.println("Price per item: " + secondInvoice.getPricePerItem());
        System.out.println("Invoice amount: " + secondInvoice.getInvoiceAmount());

        secondInvoice.setQuantity(10);
        secondInvoice.setPricePerItem(12.0);

        System.out.println("\nUpdated second invoice details:");
        System.out.println("Part number: " + secondInvoice.getPartNumber());
        System.out.println("Part description: " + secondInvoice.getPartDescription());
        System.out.println("Quantity: " + secondInvoice.getQuantity());
        System.out.println("Price per item: " + secondInvoice.getPricePerItem());
    }}
       
