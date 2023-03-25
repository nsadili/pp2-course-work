package Week07;

public class Invoice {
    private String partNumber;
    private String partDescr;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescr, int quantity, double price) {

        setPartDescr(partDescr);
        setPartNumber(partNumber);
        setPrice(price);
        setQuantity(quantity);

    }

    public String getPartNumber() {
        return partNumber;
    }

    public int getQuantity2() {
        return this.quantity;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescr() {
        return partDescr;
    }

    public void setPartDescr(String partDescr) {
        this.partDescr = partDescr;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can not be negative");
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
        return price * quantity;
    }
}
