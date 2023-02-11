import pp2.week03.ex02.Invoice;
public class InvoiceTest{
    public static void main(String[] args) {
         Invoice x = new Invoice("a", "b",  1, 5.0);
         System.out.println(x.getPartNumber());
         System.out.println(x.getDescription());
        System.out.println(x.getQuantity());
        System.out.println(x.getPrice());
        System.out.println(x.getInvoiceAmount());
        
        x.setQuantity(-3);
        x.setPrice(-6.0);
        //checking if negative values works as they should
        
        System.out.println(x.getQuantity());
        System.out.println( x.getPrice());
        
       
    }
}