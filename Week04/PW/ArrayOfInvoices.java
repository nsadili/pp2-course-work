import java.util.Scanner;

public class ArrayOfInvoices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number of invoices: ");
        int numInvoices = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numInvoices; i++) {
            System.out.println((i + 1));
            System.out.print("invoice number: ");
            int invoice_umber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("amount of the invoice: ");
            double amount = scanner.nextDouble();
            System.out.print("sales tax rate: ");
            double salesTaxRate = scanner.nextDouble();
            scanner.nextLine();

            Invoice invoice = new Invoice(invoiceNumber, customerName, amount, salesTaxRate);
            System.out.println((i + 1);
            for (int j = 0; j < invoice.getNumItems(); j++) {
                System.out.println((j + 1) + invoice.getInvoiceAmount(j));
            }
        }
    }
}