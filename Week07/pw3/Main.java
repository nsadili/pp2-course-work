package Week07.pw3;
import Week03.ex02.Invoice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Invoice product = new Invoice();
        boolean isValid;
        System.out.print("Print the part number name: ");
        product.setPartNumber(scan.nextLine());
        System.out.print("Print the part description: ");
        product.setPartDescription(scan.nextLine());
        do {
            try {
                isValid = true;
                System.out.print("Print the quantity of the item: ");
                product.setQuantity(scan.nextInt());
            } catch (IllegalArgumentException e) {
                isValid = false;
                System.out.println("The input cannot be negative!");
                e.printStackTrace();
            }
        } while (!isValid);
        do {
            try {
                isValid = true;
                System.out.print("Print the price of the item: ");
                product.setPrice(scan.nextDouble());
            } catch (IllegalArgumentException e) {
                isValid = false;
                System.out.println("The input cannot be negative!");
                e.printStackTrace();
            }
        } while (!isValid);
        System.out.printf("Part number: %s\tPart Description: %s\nQuantity: %d\tPrice: %.2f\n\n", product.getPartNumber(), product.getPartDescription(), product.getQuantity(), product.getPrice());
        scan.close();
    }
}