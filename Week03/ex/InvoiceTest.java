import javax.sound.sampled.SourceDataLine;

import pp2.week03.ex02.Invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice inv = new Invoice("838", "Razer Viper V2 Pro", 4, 169.0);


        System.out.println("Number :"+ inv.getNumber());

        System.out.println("Description :" + inv.getDescription());

        System.out.println("Quantity :" + inv.getQuantity());

        System.out.println("Price :" + inv.getPrice());

        System.out.println("Invoice Amount :" + inv.getInvoiceAmount());

    }
}
