public class Invoice {

    private String partNumber; 
    private String partDescription;
    private int quantityOfPurchased;
    private double pricePerItem;

    public Invoice (String partNumber,String partDescription,int quantityofPurchased,double pricePerItem) {

        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantityOfPurchased=quantityofPurchased;
        this.pricePerItem=pricePerItem;

    }
      public void setPartNumber(String partNumber) {
        this.partNumber=partNumber;

      }
        public String getPartNumber () {
        return partNumber;
    }
    public void setPartDescription (String partDescription){
        this.partDescription=partDescription;
    }
    public String getPartDescription () {
        return partDescription ;
    }
    public void setQuantityOfPurchased (int quantityOfPurchased) {
        if (quantityOfPurchased < 0 )
        this.quantityOfPurchased=0;
        else 
        this.quantityOfPurchased=quantityOfPurchased;
    }
    public int  getQuantityOfPurchsed () {
        return quantityOfPurchased;
    }
    public void setPricePerItem (double PricePerItem) {
        if (pricePerItem <0)
        this.pricePerItem=0;
        else
        this.pricePerItem= pricePerItem;
    }
    public double getPricePerItem () {
        return pricePerItem;
    }
     
    public double getInvoiceAmount () {
        return quantityOfPurchased*pricePerItem;
    }
}

 public class InvoiceTest {
    public static void main(String[] args) {
        Invoice cpu = new Invoice("Intel Core i9-9900k", "8 Cores / 16 Threads, 3.60 GHz up to 5.00 GHz / 16 MB Cache, Compatible only with Motherboards based on Intel 300 Series Chipsets, Intel Optane Memory Supported, Intel UHD Graphics 630", 1, 582.87);

        System.out.println("Part model: "+cpu.getPartNumber());
        System.out.println("Part description: "+cpu.getPartDescription());
        System.out.println("Part price: "+cpu.getPricePerItem());
        System.out.println("How much you need to pay: "+cpu.getInvoiceAmount());
    }
}

