package examples.InvoiceWeek04;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Invoice [] invoices = new Invoice[3];
        for (int i = 0; i < invoices.length; i++)
        {
            int quantity = scn.nextInt();
            double price = scn.nextDouble();

            invoices[i] = new Invoice(null, null, quantity, price);
        }
        int counter = 0;
        for (Invoice i : invoices){
            System.out.println(counter + " " + i.getQuantity());
            counter ++;

        }
        scn.close();
    }
}