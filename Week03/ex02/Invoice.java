package Week03.ex02;

public class Invoice {
    private String PartNumber;
    private String PartDescription;
    private int Quantity;
    private double Price;

    public Invoice(String PartDescription, String PartNumber, int Quantity, double Price) {
        this.setPartDescription(PartDescription);
        this.setPartNumber(PartNumber);
        this.setQuantity(Quantity);
        this.setPrice(Price);      
    }

    public Invoice() {
        this.setPartDescription("");
        this.setPartNumber("");
        this.setQuantity(0);
        this.setPrice(0.0);      
    }

    public String getPartNumber() {
        return PartNumber;
    }

    public String getPartDescription() {
        return PartDescription;
    }

    public int getQuantity() {
        return Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPartNumber(String PartNumber) {
        this.PartNumber = PartNumber;
    }

    public void setPartDescription(String PartDescription) {
        this.PartDescription = PartDescription;
    }

    public void setQuantity(int Quantity) {
        if (Quantity < 0) {
            Quantity = 0;
            throw new IllegalArgumentException();
        }
        this.Quantity = Quantity;
    }

    public void setPrice(double Price) {
        if (Price < 0) {
            Price = 0.0;
            throw new IllegalArgumentException();
        }
        this.Price = Price;
    }
    
    public double getInvoiceAmount() {
        return Price * Quantity;
    }
}
