package pw;
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPrice(price);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        if (partNumber == null || partNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Part number cannot be null or empty");
        }
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        if (partDescription == null || partDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("Part description cannot be null or empty");
        }
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("Part number: %s, Description: %s, Quantity: %d, Price: $%.2f, Invoice amount: $%.2f",
                partNumber, partDescription, quantity, price, getInvoiceAmount());
    }

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("001", "Part 1", 5, 10.0);

        try {
            // Try to set negative quantity and price
            invoice.setQuantity(-2);
            invoice.setPrice(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(invoice.toString());
    }
}
}

