

public class Invoice {
    private String number;
    private String description;
    private int purchased;
    private double price;

    Invoice(String num,String dec,int pur,double pr) {
        number=num;
        description=dec;

        if (pur<0) purchased=0;
        else purchased=pur;

        if(pr<0) price=0.0f;
        else price=pr;
    }

    public String getNumber() {
        return number;
    }
    
    public void setNumber(String NewNumber) {
        this.number=NewNumber;
    }

    public String getDecription() {
        return description;
    }

    public int getPurchased() {
        return purchased;
    }
    
    public void setDescription(String NewDescription) {
        this.description=NewDescription;
    }

    public void setPurchased(int NewPurchase) {
        if (NewPurchase<0) {
            this.purchased=0;
        } else this.purchased=NewPurchase;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double NewPrice) {
        if(NewPrice<0) {
            this.price=0.0f;
        } else this.price=NewPrice;
    }

    public double getInvoiceAmount() {
        return this.purchased*this.price;
    }
}