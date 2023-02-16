package geometry;
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription; 
        this.quantity = (quantity > 0) ? quantity : 0;
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }
    
    public String PartNumber() {
        return partNumber;
    }
    
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    public String PartDescription() {
        return partDescription;
    }
    
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    
    public int Quantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }
    
    public double PricePerItem() {
        return pricePerItem;
    }
    
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }
    
    public double InvoiceAmount() {
        return quantity * pricePerItem;
    }

}