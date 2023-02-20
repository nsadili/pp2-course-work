
import pp2.week03.ex02.Invoice;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice I1 = new Invoice("FOUR", "Good Keyboard", 16, 80);

        System.out.printf("A part number is %s\n", I1.getNumber());
        System.out.printf("Description: %s\n", I1.getDest());
        System.out.printf("QUANTITY: %d\n", I1.getQuantity());
        System.out.printf("PRICE: %.3f$\n", I1.getPrice());
        System.out.printf("AMOUNT: %.3f$\n", I1.getInvoiceAmount());
    }

}
