public class Invoice {

    private String partNum;
    private String partDescrb;
    private int quan;
    private double price;

    public Invoice(String partNum, String partDescrb, int quan, double price) throws Exception {
        if (price < 0)
            throw new IllegalArgumentException(String.format("%f is invalid", price));
        else
            this.price = price;
        if (quan < 0)
            throw new IllegalArgumentException(String.format("%d quantity is invalid", quan));
        else
            this.quan = quan;

        this.partDescrb = partDescrb;
        this.partNum = partNum;
    }

    public String getPartNum() {
        return partNum;
    }

    public String getPartDescrb() {
        return partDescrb;
    }

    public int getQuan() {

        return quan;
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

    public double getInvoiceAmount() {

        return quan * price;
    }

    public void setQuantity(int quan) {
        if (quan < 0)
            throw new IllegalArgumentException(String.format("%d quantity is invalid", quan));
        else
            this.quan = quan;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException(String.format("%f is invalid", price));
        else
            this.price = price;
    }

}