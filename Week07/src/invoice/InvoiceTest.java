package invoice;

import java.util.*;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String partNumber = sc.nextLine();

            String partDescription = sc.nextLine();

            int quantity = sc.nextInt();

            double pricePerItem = sc.nextDouble();

            Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

            System.out.println("Part Number: " + invoice.getPartNumber());
            System.out.println("Part Description: " + invoice.getPartDescription());
            System.out.println("Quantity: " + invoice.getQuantity());
            System.out.println("Price per item: " + invoice.getPricePerItem());
            System.out.println("Invoice amount: " + invoice.getInvoiceAmount());
        }

        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
}