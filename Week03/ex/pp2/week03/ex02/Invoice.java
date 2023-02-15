package pp2.week03.ex02;
public class Invoice 
{
    String number;
    String description;
    int quantitiy;
    double price;
    
    public Invoice(String number, String description, int quantitiy, double price) {
        this.number = number;
        this.description = description;
        this.quantitiy = quantitiy;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if ( price <= 0)
        {
            price = 0.0;
        }
    }
    public double getInvoiceAmount(int quantity, double price) {
        return quantity * price;
    }

    
     
    
}