package pp2.week03.ex02;

public class Invoice {
    private String number;
    private String dest;
    private int quantity;
    private double price;

    public double getInvoiceAmount(){
        return this.quantity*this.price;
    }

    public String getNumber(){
        return this.number;
    }
    public String getDest()
    {
        return this.dest;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }

    public void setNumber(String number){
        this.number=number;
    }
    public void setDest(String dest){
        this.dest=dest;
    }
    public void setQuantity(int quantity){
        if (quantity<0) this.quantity=0;
        this.quantity=quantity;
    }
    public void setPrice(double price){
        if (price<0.0) this.price=0.0;
        this.price=price;
    }

}
