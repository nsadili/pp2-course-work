package pp2.week03.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {



        try {
            Invoice invo = new Invoice("3423", "dsfsdf", -1, 10);
          } catch (IllegalArgumentException e) {
            System.out.println("A Runtime Exception raised!");
            System.out.println("Negative value!!!");
          } catch (Exception e) {
            System.out.println("Another type of Exception raised!");
            System.out.println("!!!");
          }
      
        
      
      



        Invoice a = new Invoice("1","iPhone X", 2, 405);
System.out.println(a.getInvoiceAmount());
    }
}