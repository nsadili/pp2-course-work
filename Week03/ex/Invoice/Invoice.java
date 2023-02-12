package Week03.ex.Invoice;

public class Invoice {
   
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity=(quantity<0?0:quantity);
        this.pricePerItem=(pricePerItem<0.0?0.0:pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    } 

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity=(quantity<0?0:quantity);
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem=(pricePerItem<0.0?0.0:pricePerItem);
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

}

class InvoiceTest {
    public static void main(String[] args) {
        Invoice tool = new Invoice("IRWIN Hammer", "Fiberglass, General Purpose, Claw, 16 oz.", 1, 9.99);

        System.out.println("Part model: "+tool.getPartNumber());
        System.out.println("Part description: "+tool.getPartDescription());
        System.out.println("Part price: "+tool.getPricePerItem());
        System.out.println("How much you need to pay: "+tool.getInvoiceAmount());
    }
}