public class InvoiceClass {
    public static void main(String[] args) {
        try {
            InvoiceClass invoice = new InvoiceClass("123", "Test item", -1, 10.0);
            System.out.println("Invoice amount: " + invoice.getInvoiceAmount());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public InvoiceClass(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity < 0 ? 0 : quantity;
        this.pricePerItem = (pricePerItem) < 0 ? 0.0 : pricePerItem;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public void setPartDescription(String partNumber) {
        this.partNumber = partNumber;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative")
        }
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (quantity < 0) {
            throw new IllegalArgumentException ("Price per item cannot be negative")
        }
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return this.quantity * this.pricePerItem;
    }
}
