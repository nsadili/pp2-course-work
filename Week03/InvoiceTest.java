public class InvoiceTest {

    public static void main(String[] args) {
      Invoice invoice = new Invoice("2005", "abcd", 5 , 45);

        System.out.println("Part Number : " +invoice.getPartNumber());
        System.out.println("Part Description : " +invoice.getPartDescription());
        System.out.println("Quantity : " +invoice.getQuantity());
        System.out.println("Price per Item : " +invoice.getPricePerItem() + "$");
        System.out.println("Invoice Amount : " +invoice.getInvoiceAmount());

    }
}
