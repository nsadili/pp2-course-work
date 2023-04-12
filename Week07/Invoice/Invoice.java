package Invoice;
public class Invoice {
    private int quantity;
    private double price;

    public Invoice(int quantity, double price) {
        if (quantity < 0 || price < 0) {
            throw new IllegalArgumentException("Quantity and price must be non-negative values.");
        }
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be a non-negative value.");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be a non-negative value.");
        }
        this.price = price;
    }

    public double calculateTotal() {
        return quantity * price;
    }
}