package examples.InvoiceWeek04;

public class Invoice {
    private String partNumber; 
    private String partDescr; 
    private  int quantity;
    private double price; 

    public Invoice (String partNumber, String partDescr, int quantity, double price) {
        
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.partDescr = partDescr;
        this.price = price;

        if(quantity < 0)
            this.setQuantity(0);

        if (price < 0)
            this.price = 0;

    }

    public String getPartNumber() {
        return partNumber;
    }

    public   int getQuantity2(){
        return this.quantity;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescr() {
        return partDescr;
    }

    public void setPartDescr(String partDescr) {
        this.partDescr = partDescr;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        
        if (quantity < 0)
            this.quantity = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;

        if (price < 0)
            this.price = 0;
    }

    public double getInvoiceAmount(){
        return price * quantity;
    }
    }