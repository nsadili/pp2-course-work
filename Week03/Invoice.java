public class Invoice {
    private String PartNumber;
    private String PartDescription;
    private int QuantityOfItem;
    private double PricePerItem;

    public Invoice( String PartNumber, String PartDescription, int QuantityOfItem, double PricePerItem){
       this.PartNumber = PartNumber;
       this.PartDescription = PartDescription;
       this.QuantityOfItem = (QuantityOfItem>0) ? QuantityOfItem: 0;
       this.PricePerItem = (PricePerItem > 0) ? PricePerItem: 0;
    }
    public String getPartNumber(){
       return PartNumber;
    }
    public void setPartNumber(){
       this.PartNumber = PartNumber;
    }
    public String getPartDescription(){
       return PartDescription;
    }
    public void setPartDescription(){
       this.PartDescription = PartDescription;
    }
    public int getQuantityOfItem(){
       return QuantityOfItem;
    }
    public void setQuantityOfItem(){
       this.QuantityOfItem = (QuantityOfItem>0) ? QuantityOfItem: 0;
    }
    public double getPricePerItem(){
       return PricePerItem;
    }
    public void setPricePerItem(){
       this.PricePerItem = (PricePerItem > 0) ? PricePerItem: 0;
    }
    public double getInvoiceAmount(){
       return QuantityOfItem * PricePerItem;
       
    }
}