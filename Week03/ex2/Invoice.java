public class Invoice {

    private String num;
    private String desc;
    private int quantity;
    private double priceItem;

    public Invoice(String num,String desc,int quantity,double priceItem){
        this.num=num;
        this.desc=desc;
        this.quantity=(quantity>0)? quantity:0;
        this.priceItem=(priceItem>0)? priceItem:0;
    }

    public double  getInvoiceAmount(){
        return quantity*priceItem;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity>0)? quantity:0;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = (priceItem>0)? priceItem:0;
    }

}