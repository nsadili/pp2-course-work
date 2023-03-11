public class Invoice {
    private String partNum;
    private String partDesc;
    private int n;
    private double prc;

    public Invoice(){
        n=0;
        prc=0.0;
    }

    public Invoice(String partNum, String partDesc, int n, double prc){
        if (n<0) throw new IllegalArgumentException ("Quantity cannot be negative!");
        if (prc<0) throw new IllegalArgumentException ("Price cannot be negative!");
        this.partNum=partNum;
        this.partDesc=partDesc;
        this.n=n;
        this.prc=prc;
    }

    public String getPartNum() {
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

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n<0) throw new IllegalArgumentException ("Quantity cannot be negative!");
        this.n = n;
    }

    public double getPrc() {
        return prc;
    }

    public void setPrc(double prc) {
        if (prc<0) throw new IllegalArgumentException ("Price cannot be negative!");
        this.prc = prc;
    }

    public double getInvoiceAmount(){
        return this.n*this.prc;
    }
}




