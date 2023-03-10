public class InvoiceTest {
    public static void main (String[] args) {
    try{
        Invoice data1 = new Invoice("707", "engine", -2, -15000);
    } catch(IllegalArgumentException e)
        {
            System.out.println("Error: "+ e.getMessage());
            System.out.println(("In addition: "+ e.toString()));
            e.printStackTrace();
    }

 }

}
