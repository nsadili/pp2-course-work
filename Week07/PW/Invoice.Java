public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws IllegalArgumentException {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) throws IllegalArgumentException {
        if (pricePerItem < 0) {
            throw new IllegalArgumentException("Price per item cannot be negative.");
        }
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return getQuantity() * getPricePerItem();
    }

    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("1234", "Widget", 5, 9.99);
            System.out.println("Part number: " + invoice.getPartNumber());
            System.out.println("Part description: " + invoice.getPartDescription());
            System.out.println("Quantity: " + invoice.getQuantity());
            System.out.println("Price per item: " + invoice.getPricePerItem());
            System.out.println("Total amount: " + invoice.getInvoiceAmount());
            
            // Handle negative quantity and price per item in the main method
            invoice.setQuantity(-5);
            invoice.setPricePerItem(-9.99);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}