package Week07;

public class Invoice{
   
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
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
        else return quantity;
    }

    public void setQuantity(int quantity){
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
        else this.quantity = quantity;
    }

    public double getPricePerItem() {
        if (pricePerItem < 0) throw new IllegalArgumentException("Price per item cannot be negative.");
        else return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem){
        if (pricePerItem < 0) throw new IllegalArgumentException("Price per item cannot be negative.");
        else this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

}

class InvoiceTest {
    public static void main(String[] args) {
        Invoice cpu = new Invoice("Intel Core i9-9900k", "8 Cores / 16 Threads, 3.60 GHz up to 5.00 GHz / 16 MB Cache, ......", -4, -2);

        System.out.println("Part model: "+cpu.getPartNumber());
        System.out.println("Part description: "+cpu.getPartDescription());
        try{
            System.out.println("Part price: "+cpu.getPricePerItem()+"$");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        try{
            System.out.printf("How much you need to pay: %.2f$", cpu.getInvoiceAmount());
        }catch (IllegalArgumentException f){
            f.printStackTrace();
        }
    }
}
