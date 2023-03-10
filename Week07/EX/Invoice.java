package EX;

class Invoice {

    private String partName;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partName, int quantity, double pricePerItem) throws Exception  {
        if (quantity < 0)
            throw new Exception("quantity can not be negative");
        if (pricePerItem < 0)
            throw new Exception("price per item can not be negative");

        this.partName = partName;
        this.quantity = quantity; 
        this.pricePerItem = pricePerItem;
    }

    // getter - accessor methods
    public String getPartName() {
        return this.partName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    // setter - modifier methods
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return this.quantity * this.pricePerItem;
    }

    public String toString() {
        return "[name: " + partName + ", quantity: " + quantity + ", price: " + pricePerItem + "]";
    }

    public static void main(String[] args) throws Exception {
      
        Invoice invoice = new Invoice("abcd", -12, -1);
        try {
            
            System.out.printf("Part Name: %s\nQuantity: %d\nPrice per item: %.3f", invoice.partName, invoice.quantity, invoice.pricePerItem);

        } catch (Exception a) {
            a.printStackTrace();

        }
    }

}
