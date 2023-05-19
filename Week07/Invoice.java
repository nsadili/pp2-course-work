package Week07;

public class Invoice {
    private String item;
    private int quantity;
    private double price;

    public Invoice(String item, int quantity, double price) {
        setItem(item);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
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

    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("Item 1", 5, -10.0);
            System.out.println("Total: " + invoice.getTotal());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}