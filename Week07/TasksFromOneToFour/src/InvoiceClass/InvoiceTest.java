package InvoiceClass;

import InvoiceClass.Invoice;

import java.util.Scanner;
public class  InvoiceTest {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please, enter the number of items : ");
            int x = scan.nextInt();
            System.out.println("Enter the quantity: ");
            int q = scan.nextInt();
            System.out.println("Enter pricePerItem:");
            double pp = scan.nextDouble();
            Invoice car = new Invoice("1234", "This is a car", q, pp);
            double m = car.getInvoiceAmount(x);
            car.showInformation();
            System.out.println("The total amount is : " + m);
        } catch (IllegalArgumentException a) {
            System.out.println("Invalid numbers were added :" + a.toString());
        }
    }
}
