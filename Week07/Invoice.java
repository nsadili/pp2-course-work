public class Invoice {

    private String partNum;
    private String partDescrb;
    private int quantity;
    private double price;

    public Invoice(String partNum, String partDescrb, int quantity, double price) throws Exception {
        if (price < 0)
            throw new IllegalArgumentException(String.format("%f is invalid price", price));
        else
            this.price = price;
        if (quantity < 0)
            throw new IllegalArgumentException(String.format("%d quantity is invalid", quantity));
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
        if (quantity < 0)
            throw new IllegalArgumentException(String.format("%d quantity is invalid", quantity));
        else
            return quantity;
    }

    public double getPrice() {
        if (price < 0)
            throw new IllegalArgumentException(String.format("%f is invalid price", price));
        else
            return price;
    }

    public void setPartNum(String partNum) {

        this.partNum = partNum;
    }

    public void setPartDescrb(String partDescrb) {
        this.partDescrb = partDescrb;
    }

    public double getInvoiceAmount() {

        return quantity * price;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public void setPrice(double price) {

        this.price = price;
    }

}
