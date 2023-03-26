public class Invoice {
    private String description;
    private int quantity;
    private double price;
    private String number;

    public Invoice(String number, String description, int quantity, double price) {
        if (quantity < 0 || price < 0) throw new IllegalArgumentException();
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String number() {
        return this.number;
    }

    public void setnumber(String number) {
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
        if(quantity < 0)
        throw new IllegalArgumentException("not negative");
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0)
        throw new IllegalArgumentException("not negative");
        this.price = price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
}
}