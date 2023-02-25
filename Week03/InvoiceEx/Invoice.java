package Week03.InvoiceEx;

public class Invoice {
    
    private int quan;
    private Double price;

    public Invoice(String description, String number , int quan , Double price){
        this.quan = quan;
        this.price = price;

        if( this.quan < 0){
        this.quan = 0;
       } 

       if( this.price < 0){
        this.price = 0.0;
       }
    }
       
    public Invoice(int i, String number, String string, double price2) {
    }

    public double getInvoiceAmount(){
        return quan * price;
    }
    
     
}
