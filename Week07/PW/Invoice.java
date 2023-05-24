package Week07.PW;
public class Invoice {
    private String partNumber;
    private String partDescr;
    private int quant;
    private double price;

    public Invoice(String partNumber, String partDescr, int quant, double price) throws Exception {
        if (price < 0)
            throw new IllegalArgumentException(String.format("%f  price not valid", price));
        else
            this.price = price;
        if (quantity < 0)
            throw new IllegalArgumentException(String.format("%d quant not nvalid", quant));
        else
            this.quant = quant;

        this.partDescr = partDescr;
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescr() {
        return partDescr;
    }

    public int getQuant() {

        return quant;
    }

    public double getPrice() {

        return price;
    }

    public void setPartNumber(String partNumber) {

        this.partNumber = partNumber;
    }

    public void setPartDescr(String partDescr) {
        this.partDescr = partDescr;
    }

    public double getInvoiceAmount() {

        return quant * price;
    }

    public void setQuant(int quant) {
        if (quant < 0)
            throw new IllegalArgumentException(String.format("%d quant not valid", quant));
        else
            this.quant = quant;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException(String.format("%f price not valid", price));
        else
            this.price = price;
    }

}
