package Week07;

public class Invoice {
  
  private String number;
  private String description;
  private int quantity;
  private double price;
  
  public Invoice(String number, String description, int quantity, double price) {
    setNumber(number);
    setDescription(description);
    setQuantity(quantity);
    setPrice(price);
  }
  
  public String getNumber() {
    return number;
  }
  
  public void setNumber(String number) {
    this.number = number;
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
    if (quantity < 0) {
      throw new IllegalArgumentException("Quantity cannot be negative");
    }
    this.quantity = quantity;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException("Price cannot be negative");
    }
    this.price = price;
  }
  
  public double getInvoiceAmount() {
    return quantity * price;
  }
  
  public static void main(String[] args) {
    try {
      Invoice invoice = new Invoice("123", "Widget", 5, -10.0);
      double amount = invoice.getInvoiceAmount();
      System.out.printf("Invoice amount: $%.2f%n", amount);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
  
}
