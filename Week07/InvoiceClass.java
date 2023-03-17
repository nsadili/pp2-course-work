package Week07;

public class InvoiceClass {
    public int validation;
    public int quantity;
    public int price;
    public InvoiceClass(int validation, int quantity, int price){
        if (price >= 0){
            this.price = price;
        } else throw new IllegalArgumentException("They cannot be negative ");
        if (validation >= 0){
            this.validation= validation;
        } else throw new IllegalArgumentException("They cannot be negative ");
        if (quantity >= 0){
            this.quantity= quantity;
        } else throw new IllegalArgumentException("They cannot be negative ");
    }
    public int getValidation(){
        return validation;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantitiy(){
        return quantity;
    }
    public void setValidation(int validation){
        if (validation >= 0){
            this.validation= validation;
        } else throw new IllegalArgumentException("They cannot be negative ");
    }
    public void setPrice(int price){
        if (price >= 0){
            this.price = price;
        } else throw new IllegalArgumentException("They cannot be negative ");
        }
    public void setQuantitiy(int quantitiy){
        if (quantity >= 0){
            this.quantity= quantitiy;
        } else throw new IllegalArgumentException("They cannot be negative ");
    }

    
}