package Week03.ex02;


public class Invoice {

    private String part_number;
    private String part_description;
    private int item_quantity;
    private double price_per_item;


    public Invoice(String part_number, String part_description, int item_quantity, double price_per_item){
        this.part_number = part_number;
        this.part_description = part_description;
        setItemQuantity(item_quantity);
        setPricePerItem(price_per_item);
    }


    public void setPartNumber(String part_number){
        this.part_number =  part_number;
    }
    public String getPartNumber(){
        return this.part_number;
    }


    public void setPartDescription(String part_description){
        this.part_description =  part_description;
    }
    public String getPartDescription(){
        return this.part_description;
    }



    public void setItemQuantity(int item_quantity){
        if(item_quantity < 0) this.item_quantity = 0;
        else this.item_quantity = item_quantity;
    }
    public int getItemQuantity(){
        return this.item_quantity;
    }


    public void setPricePerItem(double price_per_item){
        if(price_per_item < 0) this.price_per_item = 0.0;
        else this.price_per_item = price_per_item;
    }
    public double getPricePerItem(){
        return this.price_per_item;
    }

    public double getInvoiceAmount(){
        return item_quantity * price_per_item; 
    }   

}
