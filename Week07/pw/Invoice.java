public class Invoice {
    private String description;
    private int quantity;
    private double price;

    public Invoice(String description, int quantity, double price) {
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0)
        throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0)
        throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
}
}