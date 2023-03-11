package Week07;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice() {
        this(null, null, 0, 0);
    }

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0 || pricePerItem < 0)
            throw new IllegalArgumentException("Quantity or Price of Per Item cannot get negative values");
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity cannot get negative values");
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (quantity < 0)
            throw new IllegalArgumentException("Price of Per Item cannot get negative values");
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
}
