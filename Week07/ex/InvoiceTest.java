public class InvoiceTest {
    public static void main(String[] args) {

        Invoice a = new Invoice("1","iPhone X", 2, 405);
        System.out.println(a.getInvoiceAmount()); 
        
        try {
            System.out.printf("%d is quantity.\n", a.getQuantity());
        } catch(IllegalArgumentException e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Successful completion!");
        }

        try {
            System.out.printf("%d is price.\n", a.getPrice());
        } catch(IllegalArgumentException e2) {
            System.out.println(e2.getMessage());
        } finally {
            System.out.println("Successful completion!");
        }
       
    }
}
