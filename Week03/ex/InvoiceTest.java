package Week03;

public class InvoiceTest {
   public static void main(String[] args) {
    
   
    Invoice first = new Invoice("C905", "Computer", 2, 1750);
    
    System.out.println("Part number: "+ first.getNumber()+"\n"+"Part description: "+first.getDescription()+
    "\n"+"Part quantity: "+first.getQuantity()+"\n"+"Part price: "+first.getPrice());
    System.out.println("Invoice Amount: "+ first.getInvoiceAmount());
    
}
}