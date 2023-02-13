package pp2.week03.ex02;

public class Invoice {

    private String partNum;
    private String partDescrb;
    private int quantity;
    private double price;

    public Invoice(String partNum, String partDescrb, int quantity, double price) {
        if (price < 0)
            this.price = 0.0;
        else
            this.price = price;
        if (quantity < 0)
            this.quantity = 0;
        else
            this.quantity = quantity;
        this.partDescrb = partDescrb;
        this.partNum = partNum;
    }

    public String getPartNum() {
        return partNum;
    }

    public String getPartDescrb() {
        return partDescrb;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {

        return price;
    }

    public void setPartNum(String partNum) {

        this.partNum = partNum;
    }

    public void setPartDescrb(String partDescrb) {
        this.partDescrb = partDescrb;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            this.quantity = 0;
        else
            this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0)
            this.price = 0.0;
        else
            this.price = price;
    }

    public double getInvoiceAmount() {

        return quantity * price;
    }

}
