import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class invoice {
    private String number;
    private String description;
    int quantity;
    double priceperItem;
    
    public invoice(String number, String description, int quantity, double priceperItem) {
        if(priceperItem <= 0){
            priceperItem = 0.0;   
        }

        if(quantity <= 0){
            quantity=0;
        }
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.priceperItem = priceperItem;
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
      this.quantity=quantity;
    }

    public double getPriceperItem() {
        return priceperItem;
    }

    public void setPriceperItem(double priceperItem) {
       this.priceperItem=priceperItem;
    }
    
    public double getInvoiceAmount(){
        return this.quantity * this.priceperItem;
    }
    
}
