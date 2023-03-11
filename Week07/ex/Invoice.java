public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) {

        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
        
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

        if(this.quantity < 0) {
            throw new IllegalArgumentException(String.format
            ("%d is quantity and it is negative, thus it is invalid!", this.quantity));
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

        if(this.price < 0) {
            throw new IllegalArgumentException(String.format
            ("%d is price and it is invalid negative number!", this.price));
        }

    }

    public double getInvoiceAmount() {
        return this.price * this.quantity;
    }
}
