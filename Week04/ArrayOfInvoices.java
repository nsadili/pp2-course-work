import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

package pp2.week03.invoice;
package Week04;
import pp2.week03.InvoiceTest;

public class ArrayOfInvoices {
    public static void main  (String[] args ){
         Invoice invoice1 = new Invoice("1", "product", 2, 10.0 );
         Invoice invoice2 = new Invoice("2", "produkt", 5, 45.0 );
         Invoice invoice3 = new Invoice("3", "profuct", 10, 90.0);
         double amount1 = invoice1.getInvoiceAmount(invoice1.getQuantitiy, invoice1.getPricePerItem);
         double amount2 = invoice2.getInvoiceAmount(invoice2.getQuantitiy, invoice2.getPricePerItem);
         double amount3 = invoice3.getInvoiceAmount(invoice3.getQuantitiy, invoice3.getPricePerItem);

         System.out.println("Invoice 1: ", amount1);
         System.out.println("Invoice 2: ", amount2);
         System.out.println("Invoice 3: ", amount3);
                    
    }
    
}

