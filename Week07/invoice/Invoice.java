package invoice;

public class Invoice {
    private String number;
    private String description;
    private int purchased;
    private double price;

    public Invoice(String num, String dec, int pur, double pr) {
        number = num;
        description = dec;

        if (pur < 0)
            throw new IllegalArgumentException("The purchased number is negative");

        if (pr < 0)
            throw new IllegalArgumentException("The price is negative");

        purchased = pur;
        price = pr;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String NewNumber) {
        this.number = NewNumber;
    }

    public String getDecription() {
        return description;
    }

    public int getPurchased() {
        return purchased;
    }

    public void setDescription(String NewDescription) {
        this.description = NewDescription;
    }

    public void setPurchased(int NewPurchase) {
        if (NewPurchase < 0) {
            throw new IllegalArgumentException("Purchase number is negative");
        } else
            this.purchased = NewPurchase;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double NewPrice) {
        if (NewPrice < 0) {
            throw new IllegalArgumentException("Price is negative");
        } else
            this.price = NewPrice;
    }

    public double getInvoiceAmount() {
        return this.purchased * this.price;
    }
}