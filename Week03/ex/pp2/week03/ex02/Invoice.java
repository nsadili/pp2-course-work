package pp2.week03.ex02;
public class Invoice{
    private String number;
    private String description;
    private int quantity;
    private double price;

public Invoice(String number,String description, int quantity, double price){
    this.number= number;
    this.description=description;
    this.quantity= quantity;
    if(quantity <= 0){
        quantity=0;
    }
    this.price= price;
    if(price<=0){
        price=0;
    }
}
public String getNumber(){
    return number;
}
public void setNumber(String number){
    this.number= number;
}
public String getDescription(){
    return description;
}
public void setDesciption(String description){
    this.description= description;
}
public int getQuantity(){
    return quantity;
}
public void setQuanity(int quantity){
    if(quantity>0){
        this.quantity= quantity;
    }else{
        this.quantity=0;
    }
}
public double getPrice(){
    return price;
}
public void setPrice(double price){
    if(price>0){
        this.price= price;
    } else{
        this.price=price;
    }
}
public double getInvoiceAmount(){
    return price*quantity;
}
}
