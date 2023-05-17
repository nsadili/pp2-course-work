package Week7;

public class Invoice {
    private int quantity;
    private double price;

    public Invoice(int quantity, double price) {
        setQuantity(quantity);
        setPrice(price);
    }


    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity has to be positive");
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price has to be positive");
        }
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }
}
