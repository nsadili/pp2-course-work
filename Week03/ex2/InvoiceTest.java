public class  InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice=new Invoice("9876", "Salam", -1, 2.5);
        
        System.out.println("Part Number:"+invoice.getNum());
        System.out.println("Part Desc:"+invoice.getDesc());
        System.out.println("Quantity:"+invoice.getQuantity());
        System.out.println("Price per Item:"+invoice.getPriceItem());
        System.out.println("Invoice Amount:"+invoice.getInvoiceAmount());
        
    }
}