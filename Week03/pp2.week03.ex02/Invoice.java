public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

 //Provide a set and a get method for each instance variable.
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }
    //If the quantity is not positive, it should be set to 0.
    public void setQuantity(int quantity) {
        if(quantity >= 0){
            this.quantity = quantity;
        }else{
            this.quantity = 0;

        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    //If the price per item is not positive, it should be set to 0.0.
    public void setPricePerItem(double pricePerItem) {
       if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }
    //In addition, provide a method named getInvoiceAmount() 
    public double getInvoiceAmount() {
        double invoiceAmount = quantity * pricePerItem;
        return invoiceAmount;
    }
    public class InvoiceTest {

        public static void main(String[] args) {
            Invoice invoice = new Invoice("100", "X", 10, 30);
            
            // Print out the initial state of the invoice
            System.out.println("Initial invoice:");
            System.out.println("Part number: " + invoice.getPartNumber());
            System.out.println("Part description: " + invoice.getPartDescription());
            System.out.println("Quantity: " + invoice.getQuantity());
            System.out.println("Price per item: " + invoice.getPricePerItem());
            // Calculate  the invoice amount
            System.out.println("Invoice amount: $" + invoice.getInvoiceAmount());
        
            invoice.setPartNumber("200");
            invoice.setPartDescription("Y");
            invoice.setQuantity(-5);
            invoice.setPricePerItem(15);

            // Print out the updated state of the invoice
            System.out.println("Updated invoice:");
            System.out.println("Part number: " + invoice.getPartNumber());
            System.out.println("Part description: " + invoice.getPartDescription());
            System.out.println("Quantity: " + invoice.getQuantity());
            System.out.println("Price per item: " + invoice.getPricePerItem());
            
            // Calculate 
            System.out.println("Updated invoice amount: $" + invoice.getInvoiceAmount());
        }
    }
    
    
    
    
}