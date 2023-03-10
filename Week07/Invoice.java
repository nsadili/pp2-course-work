class Invoice {

    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescription, int quantity, double price) throws IllegalArgumentException {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (partNumber < 0){
            throw new IllegalArgumentException("Validation can not be negative");
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity < 0) ? 0 : quantity;
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) throws IllegalArgumentException{
        if (partNumber < 0){
            throw new IllegalArgumentException("Validation can not be negative");
        }
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
        this.quantity = (quantity < 0) ? 0 : quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.price = price;
    }

    public double getInvoiceAmount() {
        return this.getQuantity() * this.getPrice();
    }
}