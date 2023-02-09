import java.util.*;

public class Invoice {

    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity < 0) ? 0 : quantity;
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
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
        this.quantity = (quantity < 0) ? 0 : quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount() {
        return this.getQuantity() * this.getPrice();
    }
}

class InvoiceTest {
    public static void main(String[] args) {

        Invoice n = new Invoice(1234, "Book", 5, 40.0);

        System.out.println(n.getInvoiceAmount());
    }

}
