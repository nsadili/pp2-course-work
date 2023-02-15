package Week03.ex02;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice x= new Invoice("1234", "Asus Zenbook", 4, 2850.0);
        
        System.out.println("Part Number - " + x.getPartNumber());
        System.out.println("Part Description - " + x.getPartDesc());
        System.out.println("The quanity - " + x.getQuantity());
        System.out.println("Price per item - " + x.getPricePerItem());
        System.out.println("Invoice amount - " + x.getInvoiceAmount());
    }  
}
