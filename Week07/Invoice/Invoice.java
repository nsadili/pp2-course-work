package Week07.Invoice;

public class Invoice {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem;


  public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
    setPartDescription(partDescription);
    setPartNumber(partNumber);
    setPricePerItem(pricePerItem);
    setQuantity(quantity);
     
}

  //getters and setters

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

  public void setQuantity(int quantity) {
     this.quantity = quantity;
     if (quantity < 0) {
        throw new IllegalArgumentException("Quantity cannot be negative");
    }
  }

  public double getPricePerItem() {
     return pricePerItem;
  }

  public void setPricePerItem(double pricePerItem) {
     this.pricePerItem = pricePerItem;
     if (quantity < 0) {
        throw new IllegalArgumentException("Price cannot be negative");
    }
  }

  public double getInvoiceAmount() {
     return pricePerItem * quantity;
  }
}