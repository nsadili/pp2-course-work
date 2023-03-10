package W7Ex3;

public class Invoice {
    // field
    private String number;
    private String description;
    private int quantity;
    private double price;

    //constructor
    public Invoice(String number, String description, int quantity, double price) {
        if(quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if(price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }


    // Get and set Number
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    // Get and set Descriprion
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    // Get and set Quantity
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if(quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }
    // Get and set price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }


    // Method
    public double getInvoiceAmount(){
        return this.price * this.quantity;
    }

}

