package Week07;

public class Invoice {
    private String item;
    private int quantity;
    private double price;

    public Invoice(String item, int quantity, double price) {
        this.setItem(item);
        this.setQuantity(quantity);
        this.setPrice(price);
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


    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("Item1", 5, -10.0);
            double invoiceAmount = invoice.getInvoiceAmount();
            System.out.println("Invoice Amount: $" + invoiceAmount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

