package pp2.week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1", "monitor", 1, 100);

        printInvoice(invoice);

        invoice.setNumber("2");
        invoice.setDescription("keyboard");
        invoice.setQuantity(2);
        invoice.setPrice(20);

        printInvoice(invoice);

        invoice.setNumber("3");
        invoice.setDescription("dummy");
        invoice.setQuantity(-2);
        invoice.setPrice(-20);

        printInvoice(invoice);
    }

    private static void printInvoice(Invoice invoice) {
        System.out.println("Number: " + invoice.getNumber());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: " + invoice.getPrice());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
        System.out.println();
    }
}
