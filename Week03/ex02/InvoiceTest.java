package Week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice= new Invoice("Rus", "Model", -1, 2);
        System.out.println(invoice.getInvoiceAmount());
    }

}
