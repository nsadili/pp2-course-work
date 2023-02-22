package Week03.ex.Invoice;

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
        Invoice cpu = new Invoice("Intel Core i9-9900k", "8 Cores / 16 Threads, 3.60 GHz up to 5.00 GHz / 16 MB Cache, Compatible only with Motherboards based on Intel 300 Series Chipsets, Intel Optane Memory Supported, Intel UHD Graphics 630", 3, 582.87);

        System.out.println("Part model: "+cpu.getPartNumber());
        System.out.println("Part description: "+cpu.getPartDescription());
        System.out.println("Part price: "+cpu.getPricePerItem()+"$");
        System.out.printf("How much you need to pay for %d part(s): %.2f$", cpu.getQuantity(), cpu.getInvoiceAmount());
    }
}
