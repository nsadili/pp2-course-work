public class Invoice {

    private String partNumber;

    private String partDes;

    private int quantity;

    private double price;

    public Invoice() {
       
        this("Zero", "Zero", 0, 0.0);

    }

    public Invoice(int quantity, double price) {
        this("Zero", "Zero", quantity, price);
    }

    public Invoice(String partDes, String partNumber, int quantity, double price) {

        if (quantity < 0)
            throw new IllegalArgumentException("Quantity can not be negative ");
        
        if (price < 0)
            throw new IllegalArgumentException("Pricecan not be negative");

        System.out.println("Created succesfully");

        this.partDes = partDes;
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.price = price;

    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDes(String partDes) {
        this.partDes = partDes;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            throw new IllegalArgumentException("Quantity can not be negative");
        } else
            this.quantity = 0;
    }

    public void setPrice(double price) {
        if (price > 0) {
            throw new IllegalArgumentException("Price can not be negative");
        } else
            this.price = 0.0;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDes()
     {
        return partDes;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public double getPrice() 
    {
        return price;
    }

    public double getInvoiceAmount() 
    {
        return quantity * price;
    }

}