package Week7;
class Invoice {
    private String item;
    private int quantity;
    private double price;

    public Invoice(String item, int quantity, double price) {
        if (quantity < 0 || price < 0) {
            throw new IllegalArgumentException("Quantity and price cannot be negative.");
        }
        this.item = item;
        this.quantity = quantity;
        this.price = price;
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

    public double getInvoiceAmount() {
        return quantity * price;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("Item A", -1, 10.0); // Throws IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Prints "Error: Quantity and price cannot be negative."
        }

        try {
            Invoice invoice = new Invoice("Item B", 2, -5.0); // Throws IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Prints "Error: Quantity and price cannot be negative."
        }

        Invoice invoice = new Invoice("Item C", 3, 7.5); // No exception thrown
        System.out.println("Item: " + invoice.getItem());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: " + invoice.getPrice());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());
    }
}

