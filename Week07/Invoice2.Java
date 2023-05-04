public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    if (quantity < 0) {
        throw new IllegalArgumentException("Quantity cannot be negative");
    }
    this.quantity = quantity;
    if (pricePerItem < 0.0) {
        throw new IllegalArgumentException("Price per item cannot be negative");
    }
    this.pricePerItem = pricePerItem;
}

public void setQuantity(int quantity) {
    if (quantity < 0) {
        throw new IllegalArgumentException("Quantity cannot be negative");
    }
    this.quantity = quantity;
}

public void setPricePerItem(double pricePerItem) {
    if (pricePerItem < 0.0) {
        throw new IllegalArgumentException("Price per item cannot be negative");
    }
    this.pricePerItem = pricePerItem;
}

public static void main(String[] args) {
    Invoice invoice = null;
    try {
        invoice = new Invoice("12345", "Widget", -1, 19.99);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
    if (invoice != null) {
        System.out.println(invoice.getPartNumber() + ": " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
    }
}
