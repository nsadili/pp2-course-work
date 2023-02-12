package pp2.week03.ex02;

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

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) this.quantity = 0;
        else this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price <= 0) this.price = 0.0;
        else this.price = price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}
