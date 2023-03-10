package week07;

public class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double price;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
        if (quantity < 0) {
            throw new IllegalArgumentException("Negative Numbers are not allowed!");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Negative Numbers are not allowed!");
        }
        this.price=price;
    }

    public double getInvoiceAmount() {
        return this.quantity * this.price;
    }

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "number='" + number + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
