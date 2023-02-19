package Week03;

public class Invoice {
    
    private int quan;
    private String number;
    private String description;
    private Double price;

    public Invoice(int quan, String number , String description , Double price){
        this.quan = quan;
        this.number = number;
        this.description = description;
        this.price = price;

        if( this.quan < 0){
        this.quan = 0;
       } 

       if( this.price < 0){
        this.price = 0.0;
       }
    }
       
    public double getInvoiceAmount(){
        return quan * price;
    }
    
     
}
