public class InvoiceTest {
    public static void main(String[] args) {

        Invoice a = new Invoice("1","iPhone X", 5, -405);
        System.out.println(a.getInvoiceAmount()); 
        
        try {  
             a.setQuantity(5);
            System.out.printf("%d is quantity.\n", a.getQuantity());
            a.setPrice(125);
            System.out.printf("%d is price.\n", a.getPrice());
        } catch(IllegalArgumentException e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Successful completion!");
        }
       
    }
}
