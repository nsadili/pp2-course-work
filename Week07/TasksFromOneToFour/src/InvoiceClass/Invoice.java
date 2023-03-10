package InvoiceClass;

public class Invoice {
    private String partNum;
    private String partDes;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNum, String partDes, int quantity, double pricePerItem) {
        if(quantity < 0 || pricePerItem < 0.0)
            throw new IllegalArgumentException("Error happened");

            this.partNum = partNum;
            this.partDes = partDes;
            this.quantity = quantity;
            this.pricePerItem = pricePerItem;
    }

    public String getPartNum() {
        return this.partNum;
    }

    public void setPartNum(String partNum) {
       this.partNum = partNum;
    }

    public String getPartDes() {
        return this.partDes;
    }

    public void setPartDes(String partDes) {
        this.partDes = partDes;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
           throw new IllegalArgumentException("Quantity can not be negative");
        }else{
            this.quantity = quantity;
        }

    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) {
          throw new IllegalArgumentException("Price can not be negative");
        } else {
            this.pricePerItem = pricePerItem;
        }

    }

    public double getInvoiceAmount(int x) {
        if(x < 0){
            throw new IllegalArgumentException("Error happened:");
        }
        return (double)x * this.pricePerItem;
    }

    public void showInformation() {
        System.out.println("The part number is " + this.partNum);
        System.out.println("The description :  " + this.partDes);
        System.out.println("The quantity is: " + this.quantity);
        System.out.println("The price per Item is " + this.pricePerItem);
    }
}
