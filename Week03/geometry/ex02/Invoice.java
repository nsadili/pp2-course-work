package Week03.geometry.ex02;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.priceParItem = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }
}