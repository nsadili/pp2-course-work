package pp2.week03.ex02;

public class Invoice {
    private String numPart;
    private String descPart;
    private int quantity;
    private double price;

    public String getNumPart() {
        return numPart;
    }

    public void setNumPart(String numPart) {
        this.numPart = numPart;
    }

    public String getDescPart() {
        return descPart;
    }

    public void setDescPart(String descPart) {
        this.descPart = descPart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else this.quantity = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else this.price = 0.0;
    }

    public Invoice(String numPart, String descPart, int quantity, double price) {
        this.numPart = numPart;
        this.descPart = descPart;
        this.quantity = quantity;
        this.price = price;

    }
    public double getInvoiceAmount() {
        return price * quantity;
    }

}
