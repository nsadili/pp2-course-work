public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) throws IllegalArgumentException { 
        if(quantity<0) throw new IllegalArgumentException("can not be negative number");
        if(price<0) throw new IllegalArgumentException("can not be negative number");
        this.number=number;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
    } 

    public void setNumber(String number) {
        this.number=number;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public void setQuantity(int quantity) {
        if(quantity<0) throw new IllegalArgumentException("can not be negative number");
        this.quantity=quantity;
    }

    public void setPrice(double price){
        if(price<0) throw new IllegalArgumentException("can not be negative number");
        this.price=price;
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

    public double getInvoiceAmount() {
        double value = this.quantity * this.price;
        return value;
    }
}
