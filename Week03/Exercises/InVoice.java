package pp2.week03.ex02; //creation of package


public class InVoice {  //beginning of code - creation of the class "InVoice"
 
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    //creation of variables

    public InVoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0; //The ternary operator (? :) is used 
        //to assign a value based on a condition. In this case, the condition is whether the parameter is 
        //greater than 0, and if it is, the parameter value is assigned, otherwise 0 is assigned.
    }

    public String getPartNumber() {
        return partNumber; //created to get part number from program
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber; //created to set/give part number to the program. It acts in an antonymous way in the comparison with line number 22

    }

    public String getPartDescription() {
        return partDescription;  //created to get part description from the porgram
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;  //created to set/give part description to the program. It acts in an antonymous way in the comparison with line number 31
    }

    public int getQuantity() {     
        return quantity;     //created to get quantity 
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;  //created to set/give quantity to the program. It acts in an antonymous way in the comparison with line number 39
    }

    public double getPricePerItem() {
        return pricePerItem;    //created to get price from the program. It acts in an antonymous way in the comparison with line number 47
    }

    public void setPricePerItem(double pricePerItem) { 
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0; //created to set/give price to the program.  It acts in an antonymous way in the comparison with line number 47
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;   //created to get invoice amount from the program. There's no need to give invoice from the program
    }
}
