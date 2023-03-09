public class InvoiceTest
{
    public static void main(String[] args) throws Exception
    {
        Invoice invoice = new Invoice("1234", "asdf", -5 , -9.7);

        System.out.println("Part Number : " +invoice.getPartNumber());
        System.out.println("Part Description : " +invoice.getPartDescription());

        try
        {
            System.out.println("Quantity : " +invoice.getQuantity());
        }
        catch(IllegalArgumentException e)
        {
            e.printStackTrace();
        }

        try
        {
            System.out.println("Price per Item : " +invoice.getPricePerItem() + "$");
        }
        catch(IllegalArgumentException e)
        {
            e.printStackTrace();
        }    
        
        System.out.println("Invoice Amount : " +invoice.getInvoiceAmount());

    }
}