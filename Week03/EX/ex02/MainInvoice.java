import java.util.*;
public class MainInvoice {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        double p=scn.nextDouble();
        int q=scn.nextInt();
        // p= price input, q= quantity input
        Invoice mar=new Invoice("license plate","car detail attached to the front and back side of the car",0,0);
        mar.setPrice(p);
        mar.setQuant(q);
        mar.InvoiceTest();
        
    }
}
