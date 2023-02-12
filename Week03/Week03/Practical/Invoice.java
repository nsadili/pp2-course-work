public class Invoice {

    private String num;

    private String description;

    private int quantity;

    private double price;

    public Invoice(String num, String description, int quantity, double price) {
        this.num = num;
        this.description = description;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.price = (price > 0) ? price : 0;
    }

    public Invoice() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price > 0) ? price : 0;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }

}