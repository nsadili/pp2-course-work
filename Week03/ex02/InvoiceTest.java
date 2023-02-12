package Week3.ex02;

public class InvoiceTest {
    public static void main(String args[]){
        Invoice in = new Invoice("3", "trouser", 1, 12.5);
        Invoice in2 = new Invoice();
        in2.setPartDescription("jacket");
        in2.setPartNumber("2");
        System.out.println("PartNumber: "+in2.getPartNumber());

        in2.setQuantityOfPurchasedItem(3);
        System.out.println("QuantityOfPurchasedItem: "+in2.getQuantityOfPurchasedItem());

        System.out.println("InvoiceAmount: "+in.getInvoiceAmount());

        
        in2.setPricePerItem(-1);
        System.out.println("PricePerItem: "+in2.getPricePerItem());
        
    }
}
