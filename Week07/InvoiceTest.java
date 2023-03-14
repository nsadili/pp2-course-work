package Week07;

public class InvoiceTest {
    public static void main(String[] args) {
        try {
            Invoice a = new Invoice("1","iPhone X", 2, 405);
            System.out.println(a.getInvoiceAmount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
