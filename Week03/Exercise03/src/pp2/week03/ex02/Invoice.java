package pp2.week03.ex02;

public class Invoice {
    private String num;
    private String desc;
    private int amt;
    private double prc;

    public Invoice() {

    }

    public Invoice(String n, String d, int a, double p) {
        this.num = n;
        this.desc = d;
        this.amt = a;
        this.prc = p;
    }

    public String getNumber() {
        return this.num;
    }

    public String getDescription() {
        return this.desc;
    }

    public int getAmount() {
        return this.amt;
    }

    public double getPrice() {
        return this.prc;
    }

    public void setNumber(String n) {
        this.num = n;
    }

    public void setDescription(String d) {
        this.desc = d;
    }

    public void setAmount(int a) {
        if (a < 0) this.amt = 0;
        else this.amt = a;
    }

    public void setPrice(double p) {
        if (p < 0) this.prc = 0.0;
        else this.prc = p;
    }

    public double getInvoiceAmount() {
        return (this.prc * this.amt);
    }
}
