package pw;

public class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        if (quantity < 0) {
            throw new IllegalArgumentException(String.format("%d can not be quantity", quantity));
        }
        this.price = price;
        if (price < 0) {
            throw new IllegalArgumentException(String.format("%f can not be price", price));

        }
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

    public void setDesciption(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuanity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException(String.format("%d can not be quantity", quantity));
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException(String.format("%f cannot be price", price));
        }
    }

    public double getInvoiceAmount() {
        return price * quantity;
    }
}
