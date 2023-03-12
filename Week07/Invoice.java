public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        /*if (quantity < 0 || pricePerItem < 0) {
            throw new IllegalArgumentException(String.format("Invalid Price or Quantity. Try Again"));
        }*/
        if(quantity<0 && pricePerItem<0){
            throw new IllegalArgumentException(String.format("both Quantity and Price are below zero!"));
        }
        if (quantity < 0) {
            throw new IllegalArgumentException(String.format("%d is below zero, try again", quantity));
        }
        if (pricePerItem < 0) {
            throw new IllegalArgumentException(String.format("%.2f is not a good price! Try again", pricePerItem));
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;

    }

    public void setPartNumber(String part) {
        partNumber = part;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String description) {
        partDescription = description;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int count) throws IllegalArgumentException {
        // quantity = (count < 0) ? 0 : count;
        if (count < 0) {
            throw new IllegalArgumentException(String.format("%d is below or equal to zero, try again", count));
        }

        quantity = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double price) throws IllegalArgumentException {
        // pricePerItem = (price < 0.0) ? 0.0 : price;
        if (price < 0) {
            throw new IllegalArgumentException(String.format("%.2f is not a good price! Try again", price));
        }
        this.pricePerItem = price;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
}