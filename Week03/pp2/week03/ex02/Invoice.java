package pp2.week03.ex02;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
class Invoice 
{
    String number;
    String description;
    int quantitiy;
    double pricePerItem;
    
    public Invoice(String number, String description, int quantitiy, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantitiy = quantitiy;
        this.pricePerItem = pricePerItem;
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

    public int getQuantitiy() {
        return quantitiy;
    }

    public void setQuantitiy(int quantitiy) {
        this.quantitiy = quantitiy;
        if ( quantitiy <= 0 )
        {
            this.quantitiy = 0;
        } 
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
        if ( pricePerItem <= 0)
        {
            pricePerItem = 0.0;
        }
    }
    public double getInvoiceAmount(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }

    
     
    
}