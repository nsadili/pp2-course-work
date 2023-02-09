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
    }
    
  
    public double getInvoiceAmount(){
        return quantity*price ;
    }
}