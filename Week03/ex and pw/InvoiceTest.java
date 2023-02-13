
import pp2.week03.ex02.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice i = new Invoice("two", "new", -6, 7.8);
    

        System.out.println(i.getPartNum());
        System.out.println(i.getPartDescrb());
        System.out.println(i.getQuantity());
        System.out.println(i.getPrice());
        System.out.println(i.getInvoiceAmount());

    }

}
