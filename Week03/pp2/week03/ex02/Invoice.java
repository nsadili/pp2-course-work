package pp2.week03.ex02;

public class Invoice {
    private String partNum;
    private String partDes;
    private int quantityPurch;
    private double priceItem;

    public Invoice(String partNum, String partDes, int quantityPurch, double priceItem) {
        this.partNum = partNum;
        this.partDes = partDes;
        this.quantityPurch = quantityPurch;
        this.priceItem = priceItem;
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartDes() {
        return partDes;
    }

    public void setPartDes(String partDes) {
        this.partDes = partDes;
    }

    public int getQuantityPurch() {
        return quantityPurch;
    }

    public void setQuantityPurch(int quantityPurch) {
        if (quantityPurch > 0) {
            this.quantityPurch = quantityPurch;
        } else {
            this.quantityPurch = 0;
        }
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        if (priceItem > 0) {
            this.priceItem = priceItem;
        } else {
            this.priceItem = 0.0;
        }
    }
    public double getInvoiceAmount() {
return priceItem*quantityPurch;
    }
}



