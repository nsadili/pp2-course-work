package pp2.week03.ex02;

public class Main {
 
    public static void main(String[] args) {
        try {
            InVoice invoice = new InVoice("1234", "Widget", 5, -2.0);
            double invoiceAmount = invoice.getInvoiceAmount();
            System.out.println("Invoice amount: " + invoiceAmount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}