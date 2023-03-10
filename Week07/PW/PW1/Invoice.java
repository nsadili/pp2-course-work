package PW1;

public class Invoice {
    private String id;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String id, String description, int quantity, double price) {
        setId(id);
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("CANNOT.");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("CANNOT.");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}
