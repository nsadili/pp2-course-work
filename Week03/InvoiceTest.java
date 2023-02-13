    public class InvoiceTest {
        public static void main(String[] args){
            Invoice invoice = new Invoice("7895","description", 5, 10);
            System.out.println("A Part Number :"+invoice.getPartNumber());
            System.out.println("A Part Description:" +invoice.getPartDescription());
            System.out.println("Quantity of the item: " +invoice.getQuantityOfItem());
            System.out.println("A price per item:" +invoice.getPricePerItem());
        }
        
    } 

