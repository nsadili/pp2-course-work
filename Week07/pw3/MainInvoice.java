package Week07.pw3;
import java.util.*;
public class MainInvoice {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scn=new Scanner(System.in);
            double p=scn.nextDouble();
            int q=scn.nextInt();
            Invoice mar=new Invoice("license plate","car detail attached to the front and back side of the car",0,0);
            mar.setPrice(p);
            mar.setQuant(q);
            mar.InvoiceTest();
        
            tryNegative(p, q);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
    static void tryNegative(double p,int q){
        if(p<0 || q<0) {
            throw new IllegalArgumentException("negative num");
        }
        
    }
}
