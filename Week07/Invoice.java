public class Invoice {
    private int quantity;
    private double price;

    public Invoice(String description, int quantity, double price) {
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setDescription(String description) {
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("The quantity cannot have a negative value");
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("The price cannot be negative.");
        }
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }
}
