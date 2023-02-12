package pp2.week03.ex02;
import pp2.week03.ex02.Invoice;


public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice(null, null, 10, 0.3);
        double res = inv.getInvoiceAmount(inv.getQuantityOfItem(), inv.getPricePerItem());
        System.out.println(res);
}
}
