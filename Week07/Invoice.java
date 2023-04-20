package Week07;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.setPartNumber(partNumber);
        this.setPartDescription(partDescription);
        this.setQuantity(quantity);
        this.setPrice(price);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        if (partNumber == null || partNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Part number cannot be empty or null");
        }
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        if (partDescription == null || partDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("This part  can't be empty or null");
        }
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can't be negative");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be negative");
        }
        this.price = price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}
class InvoiceTest {
    public static void main(String[] args) {
        try {
            Invoice a = new Invoice(null, null, 0, 0);
            System.out.println(a.getInvoiceAmount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
