public class Invoice2 {
    private String pn;
    private String pd;
    private int q;
    private double pr;

    public Invoice2() {
        // EMPTY (DEFAULT) CONSTRUCTOR
    }

    public Invoice2(String pn, String pd, int q, double pr) {
        this.pn = pn;
        this.pd = pd;
        if (q < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.q = q;
        if (pr < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.pr = pr;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public void setQ(int q) {
        if (q < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.q = q;
    }

    public void setPr(double pr) {
        if (pr < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.pr = pr;
    }

    public String getPn() {
        return this.pn;
    }

    public String getPd() {
        return this.pd;
    }

    public int getQ() {
        return this.q;
    }

    public double getPr() {
        return this.pr;
    }

    public double getInvoiceAmount() {
        return this.q * this.pr;
    }
}

