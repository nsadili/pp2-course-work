public class InvoiceTest {
    public static void main(String[] args) {
        try{
        Invoice p1 = new Invoice("Prd4", "Bread", -5, -4.00);
        System.out.printf("%s, %s, %d, %.2f, %.2f", p1.getPartNumber(), p1.getPartDescription(), p1.getQuantity(),
                p1.getPricePerItem(), p1.getPaymentAmount());
        } catch(IllegalArgumentException e){
            System.out.println( e.getMessage());
        }
        
        /*p1.setPricePerItem(-5);
        p1.setQuantity(-2);*/

        /*System.out.printf("%s, %s, %d, %.2f, %.2f", p1.getPartNumber(), p1.getPartDescription(), p1.getQuantity(),
                p1.getPricePerItem(), p1.getPaymentAmount());*/
    }
}