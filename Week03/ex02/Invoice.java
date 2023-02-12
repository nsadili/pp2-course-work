package pp2.week03.ex02;
class Invoice{
    String partNumb;
    String partDesc;
    int quantityOfItem;
    double pricePerItem;

    //Constructors
    Invoice(String pn, String pd, int qi, double pi){
        this.partNumb = pn;
        this.partDesc = pd;
        this.quantityOfItem = qi;
        this.pricePerItem = pi;
    }

    //Setters and Getters
    public String getPartNumb() {
        return this.partNumb;
    }

    public void setPartNumb(String partNumb) {
        this.partNumb = partNumb;
    }

    public String getPartDesc() {
        return this.partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public int getQuantityOfItem() {
        return this.quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        if(quantityOfItem < 0) this.quantityOfItem = 0;
        else this.quantityOfItem = quantityOfItem;
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem < 0) this.pricePerItem = 0;
        else this.pricePerItem = pricePerItem;
    }

    //Methods
    public double getInvoiceAmount(int quantity, double price){
        return quantity * price;
    }
    

    
  
}
