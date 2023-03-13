public class InvoiceTest {
    public static void main(String[] args) {
        
        try{
       
       
       
        Invoice invoice = new Invoice("313", "Arsenal", 14, 14.0);
 
       System.out.println("Part Number: " + invoice.getPartNumber());
       System.out.println("Part Description: " + invoice.getPartDescription());
       System.out.println("Quantity: " + invoice.getquantity());
       System.out.println("Price: " + invoice.getprice());
       System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
    catch(IllegalArgumentException e){
        System.out.println(e.getMessage());

    }
 
 }
 
}