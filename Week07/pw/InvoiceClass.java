package Week07.pw;

public class InvoiceClass{
 private int quan;
private double price;

public InvoiceClass(String description, String number , int quan , double price){
    if(quan < 0 || price < 0.0){
        throw new IllegalArgumentException("Quantity and price cannot be negative");
    }
    this.quan = quan;
    this.price = price;
}
   
public InvoiceClass(int i, String number, String string, double price2) {
    
}

public void setQuan(int quan){
    if(quan < 0){
        throw new IllegalArgumentException("Quantity cannot be negative");
    }
    this.quan = quan;
}

public void setPrice(double price){
    if(price < 0.0){
        throw new IllegalArgumentException("Price cannot be negative");
    }
    this.price = price;
}

public double getInvoiceAmount(){
    return quan * price;
} 
}


// we add an IllegalArgumentException by throwing it 