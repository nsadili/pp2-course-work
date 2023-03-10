package Week07.PW;

public class Invoice {
    
    private String number;
    private String description;
    private int quantity ;
    private double price ;

    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
       // this.quantity = quantity;
       

        
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        
        this.quantity = quantity;
        
        
        
        if (price < 0) {
            throw new IllegalArgumentException("Price of item cannot be negative.");
        }
        
        this.price = price;


       // if(this.quantity <= 0) quantity = 0;
       // if(this.price <= 0) price = 0.0;
    }
    
    public Invoice(Invoice A){
        this.number = A.number;
        this.description = A.description;
        this.quantity = A.quantity;
        this.price = A.price;

        if(this.quantity <= 0) A.quantity = 0;
        if(this.price <= 0) A.price = 0.0;
    }

  
    public double getInvoiceAmount(){
        return quantity * price;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        
        
        return quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumber(String number) {
        this.number = number;

        
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price per item cannot be negative.");
        }

        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        
        this.quantity = quantity;
    }


    
   
}
