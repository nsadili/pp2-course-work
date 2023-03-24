package Week07.Ex3;

public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice1 = new Invoice("090", "Item1", -1, 10.0);
            System.out.println(invoice1.getQuantity());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Invoice invoice2 = new Invoice("091", "Item2", 5, -10.0);
            System.out.println(invoice2.getPrice());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Invoice invoice3 = new Invoice("092", "Item3", 10, 20.0);
            System.out.println("Item: " + invoice3.getPartDescr());
            System.out.println("Quantity: " + invoice3.getQuantity());
            System.out.println("Price: " + invoice3.getPrice());
            System.out.println("Invoice Amount: " + invoice3.getInvoiceAmount());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
