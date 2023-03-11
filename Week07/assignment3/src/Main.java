public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("123", "Example", 22, -15.0);
            double invoiceAmount = invoice.getInvoiceAmount();
            System.out.println("Invoice amount: " + invoiceAmount);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
