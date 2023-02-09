package Week03.ex02;

class Invoice {
    private String number;
    private String description;
    private int quantityOfItem;
    private double pricePerItem;

    public Invoice (String number, String description, int quantityOfItem, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantityOfItem = (quantityOfItem < 0) ? 0 : quantityOfItem;
        this.pricePerItem = (pricePerItem < 0) ? 0 : pricePerItem;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        this.quantityOfItem = (quantityOfItem < 0) ? 0 : quantityOfItem;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem < 0) ? 0 : pricePerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount () {
        return quantityOfItem * pricePerItem;
    }
}


public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1.", "Apples", 10, 5.5);

        System.out.println("We have sold " + invoice.getQuantityOfItem() + " " + invoice.getDescription() + " today!");

        invoice.setDescription("Oranges");
        invoice.setQuantityOfItem(20);

        System.out.println("We have sold " + invoice.getQuantityOfItem() + " " + invoice.getDescription() + " today!");

        System.out.println("Our overall income today is " + invoice.getInvoiceAmount() + " manat");
    }
}