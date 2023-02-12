public class Invoice {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem;

  // constructor
  public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.quantity = quantity;
    this.pricePerItem = pricePerItem;
  }

  // set methods
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public void setPartDescription(String partDescription) {
    this.partDescription = partDescription;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
    if (quantity <= 0) {
      this.quantity = 0;
    }
  }

  public void setPricePerItem(double pricePerItem) {
    this.pricePerItem = pricePerItem;
    if (pricePerItem <= 0.0) {
      this.pricePerItem = 0.0;
    }
  }

  // get methods
  public String getPartNumber() {
    return partNumber;
  }

  public String getPartDescription() {
    return partDescription;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getPricePerItem() {
    return pricePerItem;
  }

  public double getInvoiceAmount() {
    return quantity * pricePerItem;
  }
}

class InvoiceTest {
  public static void main(String[] args) {
    // creating an object of the Invoice class
    Invoice item = new Invoice("123", "Screwdriver", 5, 10.50);

    // printing out the initial values of the instance variables
    System.out.println("Part Number: " + item.getPartNumber());
    System.out.println("Part Description: " + item.getPartDescription());
    System.out.println("Quantity: " + item.getQuantity());
    System.out.println("Price per item: $" + item.getPricePerItem());

    // changing the quantity to a negative value and printing the updated value
    item.setQuantity(-2);
    System.out.println("\nUpdated Quantity: " + item.getQuantity());

    // changing the price per item to a negative value and printing the updated
    // value
    item.setPricePerItem(-5.50);
    System.out.println("\nUpdated Price per item: $" + item.getPricePerItem());

    // printing the invoice amount
    System.out.println("\nInvoice Amount: $" + item.getInvoiceAmount());
  }
}
