package pp2.week07;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price){

        setNumber(number);
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setNumber(String number){
        this.number = number;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setQuantity (int n){
        this.quantity = n;
        if (quantity < 0) throw new IllegalArgumentException();
    }
    public void setPrice (double n){
        this.price = n;
        if (price< 0) throw new IllegalArgumentException();
    }

    public String getNumber(){
        return number;
    }
    public String getDescription(){
        return description;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public double getInvoiceAmount(){
        return getPrice()*getQuantity();
    }
    public static void main(String[] args) {
        Invoice invoice = new Invoice("5", "dolls", 15, 10.5);

        System.out.println("Sold " + invoice.getQuantity() + " " + invoice.getDescription());

        invoice.setDescription("bears");
        invoice.setQuantity(20);

        System.out.println("Sold " + invoice.getQuantity() + " " + invoice.getDescription());

        System.out.println("Income is " + invoice.getInvoiceAmount() + " dollars");
    }
}

