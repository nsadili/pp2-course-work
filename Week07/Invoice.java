public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice() {
        number = "5";
        description = "cool";
        quantity = 500;
        price = 5.5;
    }

    public Invoice(String number, String description, int quantity, double price) throws IllegalArgumentException { 
        this.number = number;
        this.description = description;
        if(this.quantity<0) throw new IllegalArgumentException();
        else this.quantity=quantity;
        if(this.price<0) throw new IllegalArgumentException("can not be negative number");
        else this.price=price;
    } 

    public void setNumber(String number) {
        this.number=number;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public void setQuantity(int quantity) {
        if(this.quantity<0) throw new IllegalArgumentException("can not be negative number");
        else this.quantity=quantity;
    }

    public void setPrice(double price){
        if(this.price<0) throw new IllegalArgumentException("can not be negative number");
        else this.price=price;
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
