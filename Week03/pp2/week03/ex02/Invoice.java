package pp2.week03.ex02;
import static java.lang.Math.Invoice;
public class Invoice {
    String number;
    String description;
    int quantity;
    double PricePerItem;
    public Invoice(String number, String description, int quantity, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        PricePerItem = pricePerItem;
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
        this.quantity = quantity;
    }
    public double getPricePerItem() {
        return PricePerItem;
    }
    public void setPricePerItem(double pricePerItem) {
        PricePerItem = pricePerItem;
    }
    
    public void setQuantity ()
    {
        if (this.quantity <= 0) this.quantity = 0;
    }
    public double getInvoiceAmount(int quantity, double PricePerItem) 
    {
        return PricePerItem * quantity;
    }
}