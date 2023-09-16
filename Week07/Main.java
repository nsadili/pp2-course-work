public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("12345", "Widget", 10, 2.50);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

        invoice.setPartNumber("54321");
        invoice.setPartDescription("New Widget");
        invoice.setQuantity(5);
        invoice.setPricePerItem(3.50);

        System.out.println("\nUpdated Part Number: " + invoice.getPartNumber());
        System.out.println("Updated Part Description: " + invoice.getPartDescription());
        System.out.println("Updated Quantity: " + invoice.getQuantity());
        System.out.println("Updated Price per Item: " + invoice.getPricePerItem());
        System.out.println("Updated Invoice Amount: " + invoice.getInvoiceAmount());
    }
}

