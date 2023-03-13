package Week03.ex02;
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice in1 = new Invoice("Product1", "The Marker", 5, 1.25);
        Invoice in2 = new Invoice("Product2", "The Nothing", -13, -1.25);
        System.out.println("\nProd: " + in1.getPartDescription() + "\nPartNum: " + in1.getPartNumber() + " \nQuantity: " + in1.getQuantity() + "\nPrice: "+ in1.getPrice() + "\nInvoice: "+ in1.getInvoiceAmount());
        System.out.println("\nProd: " + in2.getPartDescription() + "\nPartNum: " + in2.getPartNumber() + " \nQuantity: " + in2.getQuantity() + "\nPrice: "+ in2.getPrice() + "\nInvoice: "+ in2.getInvoiceAmount());
    }
}
