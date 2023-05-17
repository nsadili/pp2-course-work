public class Invoice {
    private String item;
    private int quantity;
    private double price;

    public Invoice(String item, int quantity, double price) {
        setItem(item);
        setQuantity(quantity);
        setPrice(price);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }
}
