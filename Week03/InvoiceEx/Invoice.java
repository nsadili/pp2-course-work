package Week03.InvoiceEx;

public class Invoice {
    
    private int quan;
    private Double price;

    public Invoice(int quan, String number , String description , Double price){
        this.quan = quan;
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
