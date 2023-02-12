public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
 
    public Invoice(String partNumber, String partDescription, int quantity, double price) {
       this.partNumber = partNumber;
       this.partDescription = partDescription;
       this.quantity =  quantity;
       this.price =  price;
    }
 
    public void setPartNumber(String partNumber) {
       this.partNumber = partNumber;
    }
 
    public String getPartNumber() {
       return partNumber;
    }
 
    public void setPartDescription(String partDescription) {
       this.partDescription = partDescription;
    }
 
    public String getPartDescription() {
       return partDescription;
    }
 
    public void setQuantity(int quantity) {
       this.quantity = (quantity < 0) ? 0 : quantity;
    }
 
    public int getQuantity() {
       return quantity;
    }
 
    public void setPrice(double price) {
       this.price = (price < 0.0) ? 0.0 : price;
    }
 
    public double getPrice() {
       return price;
    }
 
    public double getInvoiceAmount() {
       return quantity * price;
    }
 }