package practicalworks;

import java.util.Scanner;

public class InvoiceMain{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("your input: ");
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

    }
}
