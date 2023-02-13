package pp2.week03.ex02;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        invoice.get();
        invoice.set();
        invoice.getinvoiceAmount();

    }

    String partdesc;
    String partnumber;
    int quantity;
    double price;

    private void get() {
        Scanner get = new Scanner(System.in);
        String partnumber = get.nextLine();
        String partdesc = get.nextLine();
        int quantity = get.nextInt();
        double price = get.nextDouble();
    }

    void set() {
        if (quantity < 0)
            quantity = 0;
        if (price < 0)
            price = 0.0;
    }

    double getinvoiceAmount() {

        price = price * quantity;
        System.out.println(price);
        return price;
    }

}
