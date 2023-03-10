
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Invoice {
    private String number;
    private String description;
    int quantity;
    double priceperItem;
    
    // public Invoice(int i, int j, int k) {
    // }

    // public Invoice(String string, String string2, int i, int j) {
    // }

    public Invoice(String number, String description, int quantity, double priceperItem) {
        if(priceperItem > 0){
            this.priceperItem = priceperItem;    
        } else throw new IllegalArgumentException("Price cannot be negative");

        if(quantity > 0){
            this.quantity = quantity;
        } else throw new IllegalArgumentException("Quantity cannot be negative");

        this.number = number;
        this.description = description;
        
       
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
        if(quantity > 0){
            this.quantity = quantity;
        } else throw new IllegalArgumentException("Quantity cannot be negative");
    }

    public double getPriceperItem() {
        return priceperItem;
    }

    public void setPriceperItem(double priceperItem) {
        if(priceperItem > 0){
            this.priceperItem = priceperItem;    
        } else throw new IllegalArgumentException("Price cannot be negative");
    }
    
    public double getInvoiceAmount(){
        return this.quantity * this.priceperItem;
    }
    
}
