public class Invoice {
    String partnum;
    String partdiscr;
    int quant;
    double price;
    Invoice(String partnum,String partdiscr,int quant,double price){
        this.partnum=partnum;
        this.partdiscr=partdiscr;
        this.quant=quant;
        this.price=price;
    }
    public void setPartnum(String partnum){
        this.partnum=partnum;
    }
    public String getPartnum(){
        return this.partnum;
    }
    public void setPartdiscr(String partdiscr){
        this.partdiscr=partdiscr;
    }
    public String getPartdiscr(){
        return this.partdiscr;

    }
    public void setQuant(int quant){
        this.quant=quant;
    }
    public int getQuant(){
        if(this.quant<0) {this.quant=0;}
        return this.quant;

    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        if(this.price<0) this.price=0.0;
        return this.price;
    }
    public double getInvoiceAmount(){
        return this.getPrice()*this.getQuant();
    }
    public void InvoiceTest(){
        System.out.println(this.partnum+"-"+this.partdiscr);
        if(this.price<0) System.out.println("Error");
        else System.out.println(this.price+" per 1");
        System.out.println(getInvoiceAmount()+" For "+this.quant);

    }
}
