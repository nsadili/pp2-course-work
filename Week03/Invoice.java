package pp2.week3.ex02;

public class Bill {
private String itemCode;
private String itemDescription;
private int itemCount;
private double itemPrice;
public Bill() {}

public Bill(String itemCode, String itemDescription, int itemCount, double itemPrice) {
    this.itemCode = itemCode;
    this.itemDescription = itemDescription;
    this.itemCount = itemCount;
    this.itemPrice = itemPrice;
}

public String getItemCode() {
    return itemCode;
}

public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
}

public String getItemDescription() {
    return itemDescription;
}

public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
}

public int getItemCount() {
    return this.itemCount;
}

public void setItemCount(int itemCount) {
    this.itemCount = Math.max(0, itemCount);
}

public double getItemPrice() {
    return itemPrice;
}

public void setItemPrice(double itemPrice) {
    this.itemPrice = Math.max(0.0, itemPrice);
}

public double getTotal() {
    return this.itemCount * this.itemPrice;
}
