package Week03.ex02;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfTheItemBeingPurchased;
    private double pricePerItem;

  Invoice(String partNumber, String partDescription, int quantityOfTheItemBeingPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantityOfTheItemBeingPurchased < 0) {
            this.quantityOfTheItemBeingPurchased = 0;
        } else {
            this.quantityOfTheItemBeingPurchased = quantityOfTheItemBeingPurchased;
        }
        if (pricePerItem < 0) {
            this.pricePerItem = 0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public void setPartNumber(String partNumber) {

        this.partNumber = partNumber;
    }

    public void setPartDescription(String partNumber) {
        this.partDescription = partDescription;
    }

    public void setQuantityOfTheItemBeingPurchased(int quantityOfTheItemBeingPurchased) {
        if (quantityOfTheItemBeingPurchased < 0) {
            this.quantityOfTheItemBeingPurchased = 0;
        } else {
            this.quantityOfTheItemBeingPurchased = quantityOfTheItemBeingPurchased;
        }
    }


    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0) {
            this.pricePerItem = 0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantityOfTheItemBeingPurchased() {
        return quantityOfTheItemBeingPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    public double  getInvoiceAmount(){
        return quantityOfTheItemBeingPurchased*pricePerItem;
    }

    public static void main(String[] args) {


    }
}





