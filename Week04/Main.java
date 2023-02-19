import java.util.Scanner;

public class Main {
    
    public static void name(String[] args) {
        Scanner scn = new Scanner(System.in);
        Invoice [] invoices = new Invoice[3];
        for(int i=0; i<invoices.length;i++){
            int quantity = scn.nextInt();
            double price = scn.nextDouble();
        }
        for (Invoice i: invoices){
            
            System.out.println(i.getInvoiceAmount);
        }
        
    }
}
