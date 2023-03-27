import java.util.Scanner;

public class invoicetest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String partNumber= scan.nextLine();
        String partDescription= scan.nextLine();
        int quantity= scan.nextInt();
        int getpercPerItem= scan.nextInt();
        invoice invoice = new invoice(partNumber, partDescription, quantity, getpercPerItem);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
