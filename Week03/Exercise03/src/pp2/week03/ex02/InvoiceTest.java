package pp2.week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        String n = "5233";
        
        Invoice mikser = new Invoice("6574", "Made in China.", 7, 39.99);
        mikser.setNumber(n);
        
        System.out.println("Number: " + mikser.getNumber());
        System.out.println("Description: " + mikser.getDescription());
        System.out.println("Quantity: " + mikser.getAmount());
        System.out.println("Price: " + mikser.getPrice());
        System.out.println("Invoice Amount: " + mikser.getInvoiceAmount());
    }
}
