package pp2.week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice a = new Invoice("1","iPhone X", 2, 405);
        System.out.println(a.getInvoiceAmount());
    }
}