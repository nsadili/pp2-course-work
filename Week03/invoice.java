import java.security.PrivilegedActionException;

public class invoice{


    private string number;
    private string description;
    private int quantity;
    private double price;

public Invoice(string number, string description, int quantity, double price) {

    this.number = number;
    this.description =  description;
    setQuantity(quantity);
    setPrice(price);
}
    public string getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public string getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
      
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity :0;
    }

    public double getPrice() {
        return price;
        }
        public void setPrice(double price) {
            this.price = (price > 0) ? price : 0.0;
        }
        public double getInvoiceAmount() {
            return quantity * price;
        }
    }

