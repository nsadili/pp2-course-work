package ex02;

public class Invoice {
    private String partNum;
    private String partDesc;
    private int purchasedAmount;
    private double itemPrice;

    public Invoice(String partNum, String partDesc, int purchasedAmount, double itemPrice) {
        this.partNum = partNum;
        this.partDesc = partDesc;
        this.purchasedAmount = purchasedAmount;
        this.itemPrice = itemPrice;
    }
    public String getPartNum() {
        return partNum;
    }
    public String getPartDesc() {
        return partDesc;
    }
    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }
    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }
    public void setPurchasedAmount(int purchasedAmount) {
        if(purchasedAmount>=0) {
            this.purchasedAmount = purchasedAmount;
        } else {
            this.purchasedAmount = 0;
        }
    }
    public void setItemPrice(double itemPrice) {
        if(itemPrice>=0) {
            this.itemPrice = itemPrice;
        } else {
            this.itemPrice = 0.0;
        }
    }
    public int getPurchasedAmount() {
        return purchasedAmount;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public double getInvoiceAmount() {
        return this.itemPrice * this.purchasedAmount;
    }






    @Override
    public String toString() {
        return "Invoice [partNum=" + partNum + ", partDesc=" + partDesc + ", purchasedAmount=" + purchasedAmount
                + ", itemPrice=" + itemPrice + "]";
    }  
}
