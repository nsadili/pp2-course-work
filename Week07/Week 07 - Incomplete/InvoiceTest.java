import Invoice.Invoice;

public class InvoiceTest {

    public static void main (String[] args){

        try {
            Invoice i1 = new Invoice("N12453", "Processor AMD Ryzen 5700X 512GB", -5, -279.99);
            Invoice i2 = new Invoice("N13627", "SSD 512GB", 3, 99.99);
            System.out.printf("Item 1\nPart Number: %s\nPart Description: %s\nQuantity: %d\nPrice %f\n\n\n",
            i1.getPartNum(), i1.getPartDesc(), i1.getN(), i1.getPrc());
        
            System.out.printf("Item 2\nPart Number: %s\nPart Description: %s\nQuantity: %d\nPrice %f\n\n\n",
            i2.getPartNum(), i2.getPartDesc(), i2.getN(), i2.getPrc());
    
    
             System.out.println("Invoice amount of item 1: " + i1.getInvoiceAmount());
             System.out.println("Invoice amount of item 2: " + i2.getInvoiceAmount());
        } catch (Exception e) {
            System.out.println("Please, provide valid input values!");
        }
    }
}
