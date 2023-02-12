package pp2.week03.ex02;

class Invoice {
    private String partNumber;
    private String partDesc;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDesc, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDesc = partDesc;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public String getPartDesc() {
        return this.partDesc;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public Double getInvoiceAmount() {
        return this.quantity * this.pricePerItem;
    }
}
