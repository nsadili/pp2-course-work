package pp2.week3.ex2;

public class Invoice {

    private String partNumber;

    private String partDes;

    private int quantity;

    private double price;

    public Invoice() {
        // this.partDes = "Null";
        // this.partNumber = "Null";
        // this.quantity = 0;
        // this.price = 0.0;
        this("Null" , "Null", 0, 0.0);

    }

    public Invoice(String partDes, String partNumber, int quantity,double price){
        this.partDes = partDes;
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.price = price;

        if(quantity<0) this.quantity=0;
        if(price<0) this.price=0.0;


    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDes(String partDes) {
        this.partDes = partDes;
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
        this.quantity = quantity;
        }else this.quantity=0;
    }

    public void setPrice(double  price) {
        if(price>0){
          this.price = price;
    }else this.price=0;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDes() {
        return partDes;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount(){
        return quantity*price;
    }

   
    

    

}
