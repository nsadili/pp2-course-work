package pp2.week03.ex02;

public class Invoice {
    String partNumber;
    String description;
    int quantity;
    double price;

    public Invoice (String partNumber, String description, int quantity, double price) {
        if (quantity<0){
        quantity = 0;
        }

        if (price<0) {
            price = 0.0;
        }

        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;

    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber() {
        this.partNumber = partNumber;

    }
    public String getDescription() {
        return description;
    }
    public void setDescription() {
        this.description = description;
    }
     
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity() {
        this.quantity = quantity;
    }

  public double getPrice() {
    return price;
  }

  public void setPrice()  {
    this.price = price;
  }

  public double getInvoiceAmount() {
    return this.quantity*this.price;

  }
}
