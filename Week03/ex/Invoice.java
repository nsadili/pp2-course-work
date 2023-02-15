package Week03;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;
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
    
    public double getPrice() {
        return price;
    }
    
    public Invoice(String number, String description, int quantity,double price){
        this.number=number;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
        
    }
    public void setQuantity(int quantity){
        if(quantity>0){
            this.quantity=quantity;

        }
        else quantity=0;
    }
    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }
        else price=0.0;

    }
    public double getInvoiceAmount(){
        return this.price*this.quantity;
    }

}
