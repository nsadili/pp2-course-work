package Ex02;

public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;
    

    public Invoice(String partNumber, String partDescription, int quantity, double unitPrice){
    
    setPartNumber(partNumber);
    setDescription(partDescription);
    setQuantity(quantity);
    setUnitPrice(unitPrice);
    }

    public void setPartNumber(String partNumber){
    this.partNumber = partNumber;
    }
    public void setDescription(String partDescription){
    this.partDescription = partDescription;
    }
    public void setQuantity(int quantity){
    this.quantity = (quantity < 0) ? 0 : quantity;
    }
    public void setUnitPrice(double unitPrice){
    this.unitPrice = (unitPrice < 0.0) ? 0.0 : unitPrice;
    }
  
    public String getPartNumber(){
    return partNumber;
    }
    public String getDescription(){
    return partDescription;
    }
    public int getQuantity(){
    return quantity;
    }
    public double getUnitPrice(){
    return unitPrice;
    }
    public double getInvoiceAmount(){
    return getQuantity() * getUnitPrice();
    }
    }
   