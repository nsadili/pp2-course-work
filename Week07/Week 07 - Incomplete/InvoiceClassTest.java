package Week07;

public class InvoiceClassTest {
    public static void main(String[] args){
        
        try{
            InvoiceClass in = new InvoiceClass(-1, 10, 110);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: "+ e.getMessage());
            System.out.println(("In addition: "+ e.toString()));
            e.printStackTrace();
        }
    }
    
}