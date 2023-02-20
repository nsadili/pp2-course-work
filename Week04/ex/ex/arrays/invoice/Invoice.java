package ex.arrays.invoice;

public class Invoice {
    private String invoiceNumber;
    private int quantity;
    private double price;
    
    public Invoice(String invoiceNumber2, String invoiceDesc2, int quantity2, double price2) {
    }

    public void invoice(String invoiceNumber, String invoiceDesc, int quantity, double price) {
        this.invoiceNumber = invoiceNumber;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public double getInvoiceAmount() {
        return quantity * price;
    }
}
    
 


