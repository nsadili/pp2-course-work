package EX.invoice;

public class Invoice {
    String partNumber;
    String partDescription;
    Integer quantityOfItem;
    Double priceOfItem;

    // setter methods

    public Invoice (String partNumber, String partDiscription, int quantityOfItem, Double priceOfItem){
        this.setNumber(partNumber);
        this.setDescription(partDiscription);
        this.setQuantity(quantityOfItem);
        this.setPrice(priceOfItem);
    }

    public void setNumber (String n){
        this.partNumber = n;
    }

    public void setDescription (String n){
        this.partDescription = n;
    }

    public void setQuantity (Integer n){
        this.quantityOfItem = n;
        if (quantityOfItem < 0) quantityOfItem = 0;
    }

    public void setPrice (Double n){
        this.priceOfItem = n;
        if (priceOfItem < 0) priceOfItem = 0.0;
    }

    // getter methods

    public String getNumber(){
        return this.partNumber;
    }

    public String getDescription(){
        return this.partDescription;
    }

    public Integer getQuantity(){
        return this.quantityOfItem;
    }

    public Double getPrice(){
        return this.priceOfItem;
    }

    // methods

    public double getInvoiceAmount(){
        return quantityOfItem * priceOfItem;
    }

}
