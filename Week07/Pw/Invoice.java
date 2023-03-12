package Pw;

public class Invoice {

    private String partNumber;

    private String partDescription;

    private int quantity;

    private double price;


    public Invoice(int quantity, double price) {
        this("Null", "Null", quantity, price);
    }

    public Invoice(String partDes, String partNumber, int quantity, double price) {


        if (this.quantity < 0) {

            throw new IllegalArgumentException("Cannot be negative");
        }

        if (this.price < 0) {
            throw new IllegalArgumentException("Cannot be negative");

        }

    }

    public String getPartNumber() {
        return partNumber;
    }
    
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    public String getPartDescription() {
        return partDescription;
    }
    
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    
    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity){
        if (this.quantity < 0) {
            throw new IllegalArgumentException(" Please, declare positive variable.");
        }  
        else
        
        this.quantity = 0;
       }

    

    public double getprice(){
        return price;
    }

    public void setprice(double price)
    {
        if (this.price < 0) {
        
            throw new IllegalArgumentException("Please, declare positive variable.");
        }
        else
        this.price = 0;
    }

    public double getInvoiceAmount()
    {
        return quantity * price;
    }


}