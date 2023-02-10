public class Invoice {

    private String partNumber;

    private String partDescription;

    private int quantity;

    private double price;

    public Invoice(String partNumber, String partDescription, int quantitiy, double price) {

        this.partNumber = partNumber;

        this.partDescription = partDescription;

        this.quantity = quantitiy;

        this.price = price;

        if (this.quantity < 0) {
            this.quantity = 0;
        }

        if (this.price < 0) {
            this.price = 0.0;

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
            this.quantity = 0;
        }

    }

    public double getprice(){
        return price;
    }

    public void setprice(double price)
    {
        if (this.price < 0) {
            this.price = 0.0;

        }
    }

    public double getInvoiceAmount()
    {
        return quantity * price;
    }


}
