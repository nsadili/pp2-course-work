import java.util.Scanner;
import Invoice.Invoice;

public class ArrayOfInvoices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of Invoices: ");
        int l=scan.nextInt();
        Invoice[] invoice= new Invoice[l];
        for(int i=0;i<l;i++){
            System.out.printf("Product Num of invoice %d: ",i+1);
            String No1= scan.next();

            System.out.printf("Description of invoice %d: ",i+1);
            String Description1= scan.next();

            System.out.printf("Quantity Num of invoice %d: ",i+1);
            int quantity1= scan.nextInt();
            
            System.out.printf("Price Num of invoice %d: ",i+1);
            double price1= scan.nextDouble();

            invoice[i] = new Invoice(No1,Description1,quantity1,price1);
            System.out.printf("Amount of %s with product number of '%s' is %d\n", invoice[i].getDescription(), invoice[i].getNo(), invoice[i].getQuantity());
        }

    }
}
