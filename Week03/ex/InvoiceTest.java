
import pp2.week3.ex2.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {

            Invoice i=new Invoice("ALfa","Beta",10,5);

            i.setPrice(-5);

            System.out.println(i.getPrice());

            i.setPrice(3);

            i.setQuantity(12);

        System.out.println(i.getInvoiceAmount());

        
        

    
    }
}