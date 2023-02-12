public class InVoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("7669", "hhgef", -121, 2.5);

        System.out.println("Part Number" + invoice.getNum());
        System.out.println("Description" + invoice.getDescription());
        System.out.println("Quantity" + invoice.getQuantity());
        System.out.println("Price" + invoice.getPrice());
        System.out.println("Amount" + invoice.getInvoiceAmount());
    }
}
