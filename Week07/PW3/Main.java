package PW3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Invoice product = new Invoice();
        boolean isValid;

        do {
            do {
                try {
                    isValid = false;
                    System.out.print("Print the part number name: ");
                    product.setNumber(scan.nextLine());
                } catch (IllegalStringException e){
                    isValid = true;
                    System.out.println("The input must be a word!");
                    e.printStackTrace();
                }
            } while (isValid);
            do {
                try {
                    isValid = false;
                    System.out.print("Print the part description: ");
                    product.setDescription(scan.nextLine());
                } catch (IllegalStringException e){
                    isValid = true;
                    System.out.println("The input must be a word!");
                    e.printStackTrace();
                }
            } while (isValid);
            do {
                try {
                    isValid = false;
                    System.out.print("Print the quantity of the item: ");
                    product.setQuantity(scan.nextInt());
                } catch (IllegalArgumentException e){
                    isValid = true;
                    System.out.println("The input cannot be negative!");
                    e.printStackTrace();
                }
            } while (isValid);
            do {
                try {
                    isValid = false;
                    System.out.print("Print the price of the item: ");
                    product.setPrice(scan.nextInt());
                } catch (IllegalArgumentException e){
                    isValid = true;
                    System.out.println("The input cannot be negative!");
                    e.printStackTrace();
                }
            } while (isValid); 
            
            System.out.printf("Part number: %s\tPart Description: %s\nQuantity: %d\tPrice: %.2f\n", product.getNumber(), product.getDescription(), product.getQuantity(), product.getPrice());

        } while (true);
    }
}
