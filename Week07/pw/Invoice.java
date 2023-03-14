package pw;

public class Invoice {
    private String partNum;
    private String partDesc;
    private int q;
    private double price;

    public void Invoice(String partNum, String partDesc, int q, double price) {
        this.partNum = partNum;
        this.partDesc = partDesc;

        if (q < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.q = q;

        if (price < 0.0) {
            throw new IllegalArgumentException("Price per item cannot be negative.");
        }
        this.price = price;
    }

    public String getPartNumber() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        if (q < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.q = q;
    }

    public double getPricePerItem() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.0) {
            throw new IllegalArgumentException("Price per item cannot be negative.");
        }
        this.price = price;
    }

    public double getInvoice() {
        return q * price;
    }
}