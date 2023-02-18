import java.util.Scanner;

import invoice.Invoice;
public class ArrayOfInvoices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n=sc.nextInt();
        Invoice[] inv = new Invoice[n];
        for (int i=0; i<n; i++){
            String partNum=sc.next();
            String partDesc=sc.next();
            int nn=sc.nextInt();
            double prc=sc.nextDouble();   
            inv[i]=new Invoice(partNum, partDesc, nn, prc); 
        }
        for (int i=0; i<n; i++){
            System.out.println("Invoice amount at invoice "+ i+" is: " + inv[i].getInvoiceAmount());
        }
        sc.close();
        }
}