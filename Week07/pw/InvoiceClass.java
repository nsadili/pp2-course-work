package pw;

public class InvoiceClass {
    public static void main(String[] args){
        Invoice a = new Invoice("BB", "BlackBoard", 0, 0);
        try{
            a.setQuantity(-1);
        }catch(Exception err){
            throw new IllegalArgumentException("Not valid input");
        }
    }
}

class Invoice{
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
    void setQuantity(int quantity) throws IllegalArgumentException{
        if(quantity>=0){
        this.quantity = quantity;}
        else{
            throw new IllegalArgumentException();
        }
    }
    void setPricePerItem(double pricePerItem) throws IllegalArgumentException{
        if(pricePerItem<0){
            throw new IllegalArgumentException();
        }else{
            this.pricePerItem = pricePerItem;
        }
    }

    Double getInvoiceAmount(){
        return this.quantity * this.pricePerItem;
    }

}
