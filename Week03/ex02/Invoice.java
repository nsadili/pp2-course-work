package Week03.ex02;

public class Invoice {
    private String partNumber, partDescription;
    private int itemQuantity;
    private double itemPrice;

    public Invoice(String partNumber, String partDescription, int itemQuantity, double itemPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity < 0 ? 0 : itemQuantity;
        this.itemPrice = itemPrice < 0 ? 0 : itemPrice;
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

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getInvoiceAmount() {
        return this.itemQuantity * this.itemPrice;
    }

    public String toString() {
        return String.format("Invoice #%s\nDescription:\n%s\nQuantity: %d\nPrice per item: %f\nInvoice amount: %f\n",
                            this.partNumber, this.partDescription, this.partDescription, this.itemQuantity, this.itemPrice, this.getInvoiceAmount());
    }
}
