package Invoice;

public class Invoice {
    private String No;
    private String Description;
    private int quantity;
    private double price;

    public Invoice(String No, String Description, int quantity, double price) {
        this.No = No;
        this.Description = Description;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.price = (price > 0) ? price : 0.0;
    }

    public String getNo() {
        return No;
    }

    public String getDescription() {
        return Description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setNo(String no) {
        No = no;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount(){
        return getQuantity()*getPrice();
    }
}
