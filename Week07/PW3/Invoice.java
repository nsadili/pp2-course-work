package PW3;

public class Invoice {
    String partNumber;
    String partDescription;
    Integer quantityOfItem;
    Double priceOfItem;

    public Invoice(){};
    public Invoice (String partNumber, String partDiscription, int quantityOfItem, Double priceOfItem){
        this.setNumber(partNumber);
        this.setDescription(partDiscription);
        this.setQuantity(quantityOfItem);
        this.setPrice(priceOfItem);
    }
    public void setNumber (String n){
        for (int i = 0; i < n.length(); i++){
            if (!(n.charAt(i) == ' ' || (n.charAt(i) >= 65 && n.charAt(i) <= 90) || (n.charAt(i) >= 97 && n.charAt(i) <= 122) || n.charAt(i) == '\n')) {
                throw new IllegalStringException(); 
            }
        }
        this.partNumber = n;
    }
    public void setDescription (String n){
        for (int i = 0; i < n.length(); i++){
            if (!(n.charAt(i) == ' ' || (n.charAt(i) >= 65 && n.charAt(i) <= 90) || (n.charAt(i) >= 97 && n.charAt(i) <= 122) || n.charAt(i) == '\n')) throw new IllegalStringException(); 
        }
        this.partDescription = n;
    }
    public void setQuantity (int n){
        this.quantityOfItem = n;
        if (quantityOfItem < 0) throw new IllegalArgumentException();
    }
    public void setPrice (double n){
        this.priceOfItem = n;
        if (priceOfItem < 0) throw new IllegalArgumentException();
    }
    public String getNumber(){
        return this.partNumber;
    }
    public String getDescription(){
        return this.partDescription;
    }
    public int getQuantity(){
        return this.quantityOfItem;
    }
    public double getPrice(){
        return this.priceOfItem;
    }
    public double getInvoiceAmount(){
        return quantityOfItem * priceOfItem;
    }
}