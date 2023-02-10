package PackageFolder;

public class Invoice{
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    String getPartNumber(){
        return this.partNumber;
    }
    String getPartDescription(){
        return this.partDescription;
    }
    int getQuantity(){
        return this.quantity;
    }
    Double getPricePerItem(){
        return this.pricePerItem;
    }

    void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    void setQuantity(int quantity){
        if(quantity>=0){
        this.quantity = quantity;}
        else{
            this.quantity = 0;
        }
    }
    void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }

    Double getInvoiceAmount(){
        return this.quantity * this.pricePerItem;
    }

}