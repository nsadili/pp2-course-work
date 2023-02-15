import pp2.week03.ex02.Invoice;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        Invoice invoice = new Invoice(null, null, 0, 0);

        
        System.out.print("Enter the part number: ");
        String partNumber = input.nextLine();
        invoice.setNumber(partNumber);

        System.out.print("Enter the part description: ");
        String partDescription = input.nextLine();
        invoice.setDescription(partDescription);

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        invoice.setQuantitiy(quantity);

        System.out.print("Enter the price per item: ");
        double price = input.nextDouble();
        invoice.setPrice(price);

       
        System.out.println("Invoice Details:");
        System.out.println("Part Number: " + invoice.getNumber());
        System.out.println("Part Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantitiy());
        System.out.println("Price per item: " + invoice.getPrice());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount(quantity, price));
    }
}
