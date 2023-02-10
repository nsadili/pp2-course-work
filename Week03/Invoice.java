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

    public void setQuantity(int count) {
        quantity = (count < 0) ? 0 : count;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double price) {
        pricePerItem = (price < 0.0) ? 0.0 : price;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
}
