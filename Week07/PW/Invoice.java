public class Invoice {
    private String description;
    private int quantity;
    private double price;

    public Invoice(String description, int quantity, double price) {
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setDescription(String description) {
        this.description = description;
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

}

public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("Widget", -1, 10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Invoice invoice = new Invoice("Widget", -1, 10.0);

    }

}

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}