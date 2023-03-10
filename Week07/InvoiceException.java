public class InvoiceException {
    public static void main(String[] args) {
        try {
            Invoice object = new Invoice(-20, "pencil", 30, 10);
        } catch (IllegalArgumentException a) {
            System.out.println(a.getMessage());
        }
    }
}
