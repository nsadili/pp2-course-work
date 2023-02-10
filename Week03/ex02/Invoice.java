class Invoice {
    private String number;
    private String des;
    private int quan;
    private double price;

    public Invoice(String newNumber, String newDes, int newQuan, double newPrice) {
        number = newNumber;
        des = newDes;
        quan = newQuan;
        price = newPrice;

        this.number = number;
        this.des = des;
        this.quan = (quan < 0 ? 0 :quan);
        this.price = (price < 0 ? 0.0 : price);
    }
    public Invoice() {
    }
    public void setNumber(String newNumber) {
        number = newNumber;
    } 
    public String getNumber() {
        return number;
    }
    public void setDes(String newDes) {
        des = newDes;
    } 
    public String getDes() {
        return des;
    }
    public void setQuan(int newQuan) {
        quan = newQuan;
        if(quan < 0) this.quan = 0;
    } 
    public int getQuan() {
        return quan;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
        if(price < 0) this.price =0.0;
    }
    public double getPrice() {
        return price;
    }
    public double getInvoiceTest() {
        return quan * price;
    }
}


