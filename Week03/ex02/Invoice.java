package Week3.ex02;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfPurchasedItem;
    private double pricePerItem;
    public Invoice(){
        //Default constructor
    }
    public Invoice(String partNumber, String partDescription, int quantityOfPurchasedItem, double pricePerItem){
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantityOfPurchasedItem=quantityOfPurchasedItem;
        this.pricePerItem=pricePerItem;
        setQuantityOfPurchasedItem(quantityOfPurchasedItem);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber(){
        return this.partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }

    public String getPartDescription(){
        return this.partDescription;
    }

    public void setPartDescription(String partDescription){
        this.partDescription=partDescription;
    }

    public int getQuantityOfPurchasedItem(){
        return quantityOfPurchasedItem;
    }

    public void setQuantityOfPurchasedItem(int quantityOfPurchasedItem){
        if(quantityOfPurchasedItem<0) this.quantityOfPurchasedItem=0;
        else
        this.quantityOfPurchasedItem=quantityOfPurchasedItem;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem){
        if(pricePerItem<0) this.pricePerItem=0;
        else
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(){
        return (double)quantityOfPurchasedItem*pricePerItem;
    }

}
