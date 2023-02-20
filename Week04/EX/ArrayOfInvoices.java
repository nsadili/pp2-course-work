import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import pp2.week03.ex02.Invoice.Invoice;

public class ArrayOfInvoices {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1", "product", 2, 10.0 );
        Invoice invoice2 = new Invoice("2", "produkt", 5, 45.0 );
        Invoice invoice3 = new Invoice("3", "profuct", 10, 90.0);
        double amount1 = invoice1.getInvoiceAmount();
        double amount2 = invoice2.getInvoiceAmount();
        double amount3 = invoice3.getInvoiceAmount();

        System.out.println("Invoice 1: " + amount1);
        System.out.println("Invoice 2: " + amount2);
        System.out.println("Invoice 3: " + amount3);
    }
}
