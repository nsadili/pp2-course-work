package Week03;

public class Invoice {
    
    private String number;
    private String description;
    private int quantity ;
    private double price ;

    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
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

    //public void compare(int quantity , double price){
    //    if(this.quantity <= 0) quantity = 0;
    //    if(this.price <= 0) price = 0.0;
    //}
  
    public double getInvoiceAmount(){
        return (double) quantity * price;
    }


}
  