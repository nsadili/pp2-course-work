package pp2.week03.ex02;

public class Invoice {
    private String partnum;
    private String partdesc;
    private int quantity;
    private double ppi; //price per item

    public Invoice(String partnum, String partdesc, int quantity, double ppi) {
        this.partnum = partnum;
        this.partdesc = partdesc;
        setQuantity(quantity);
        setPPI(ppi);
    }

    public String getPartnum() {
        return partnum;
    }

    public void setPartnum(String partnum) {
        this.partnum = partnum;
    }

    public String getPartdesc() {
        return partdesc;
    }

    public void setPartdesc(String partdesc) {
        this.partdesc = partdesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPPI() {
        return ppi;
    }

    public void setPPI(double ppi) {
        this.ppi = (ppi > 0) ? ppi : 0.0;
    }

    public double getInvoiceAmount() {
        return quantity * ppi;
    }
}