public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

// Constructor
public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    if(quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
    this.quantity = quantity;
    if(pricePerItem < 0) throw new IllegalArgumentException("Price cannot be negative");
    this.pricePerItem = pricePerItem;
}

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
    if(quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
    this.quantity = quantity;
}

public double getPricePerItem() {
    return pricePerItem;
}

public void setPricePerItem(double pricePerItem) {
    if(quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
    this.pricePerItem = pricePerItem;
}

public double getInvoiceAmount() {
    return quantity * pricePerItem;
}

    
}


