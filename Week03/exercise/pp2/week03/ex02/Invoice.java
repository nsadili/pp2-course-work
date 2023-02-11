package pp2.week03.ex02;

public class Invoice {
    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String description, int quantity, double price){

        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if(quantity <= 0){
            this.quantity = 0;
        }else {
        this.quantity = quantity;
    }
}
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price <= 0){
            this.price = 0.0;
        }else {
        this.price = price;
    }

}
public double getInvoiceAmount(){
     return quantity * price;
}

}
