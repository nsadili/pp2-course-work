package Week03.ex02;

import java.util.Set;

public class Invoice {
    private String partNum;
    private String partDesc;
    private int purchasedAmount;
    private double itemPrice;


public Invoice(String partNum , String partDesc , int purchasedAmount , double itemPrice){
    this.partDesc = partDesc;
    this.partNum = partNum;
    setItemPrice(itemPrice);
    setPurchasedAmount(purchasedAmount);
}

public String getPartNum() {
    return partNum;
}

public void setPartNum(String partNum) {
    this.partNum = partNum;
}

public String getPartDesc() {
    return partDesc;
}

public void setPartDesc(String partDesc) {
    this.partDesc = partDesc;
}

public int getPurchasedAmount() {
    return purchasedAmount;
}

public void setPurchasedAmount(int purchasedAmount) {
    if(purchasedAmount < 0) this.purchasedAmount = 0;
    else this.purchasedAmount = purchasedAmount;
}

public double getItemPrice() {
    return itemPrice;
}

public void setItemPrice(double itemPrice) {
    if(itemPrice< 0) this.itemPrice= 0.0;
        else this.itemPrice = itemPrice;
}

public double getInvoiceAmount(){
    return purchasedAmount * itemPrice ; 
}

 @Override
    public String toString() {
        return "Invoice [partNum=" + partNum + ", partDesc=" + partDesc + ", purchasedAmount=" + purchasedAmount
                + ", itemPrice=" + itemPrice + "]";
    }  

    }