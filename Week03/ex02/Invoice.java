package Week03.ex02;

public class Invoice {
        private String partNumber;
        private String partDescription;
        private int quantity;
        private double price;
    
        public Invoice(String partNumber, String partDescription, int quantity, double price) 
        {
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.quantity = (quantity < 0) ? 0 : quantity;
            this.price = (price < 0) ? 0 : price;
        }
    
        public String getPartNumber() 
        {
            return partNumber;
        }
    
        public void setPartNumber(String partNumber) 
        {
            this.partNumber = partNumber;
        }
    
        public String getPartDescription() 
        {
            return partDescription;
        }
    
        public void setPartDescription(String partDescription) 
        {
            this.partDescription = partDescription;
        }
    
        public int getQuantity() 
        {
            return this.quantity;
        }
    
        public double getPrice() 
        {
            return price;
        }
    
        public double getInvoiceAmount() 
        {
            return this.quantity * this.price;
        }

    class InvoiceTest{
public static void main(String[]args){}
    }
}
