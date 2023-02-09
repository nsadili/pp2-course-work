package Week03;

public class Invoice {
    
    private int quan;
    private String number;
    private String description;
    private Double price;

    public Invoice(int quan, String number , String desciption , Double price){
        this.quan = quan;
        this.number = number;
        this.description = description;
        this.price = price;

        if( quan <= 0){
        quan = 0;
       } 

       if( price <= 0){
        price = 0.0;
       }
    }
       
    public double getInvoiceAmount(){
        return (quan * price);
    }
    

}
