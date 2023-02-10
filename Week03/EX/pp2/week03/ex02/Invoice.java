package pp2.week03.ex02;

public class Invoice{
private String number;
private String desc;
private int quantity;
private double price;

public Invoice(String number,String desc,int quantity,double price)
{
this.number=number;
this.desc=desc;
this.quantity=quantity;
this.price=price;
if (quantity<0) this.quantity=0;
if (price<0) this.quantity=0;

}

public String getNumber() {
    return number;
}
public void setNumber(String number) {
    this.number=number;
}
public String getDesc() {
    return desc;
}
public void setDesc(String desc) {
    this.desc=desc;
}

public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    this.quantity=quantity;
    if (quantity<0) this.quantity=0;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price=price;
    if (price<0) this.quantity=0;
}
public double getInvoiceAmount(){
    return quantity*price;
}

}
