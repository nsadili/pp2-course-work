import java.util.Scanner;

public class ArrayOfInvoices {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Invoice[] invoices = new Invoice[10];
        //pasted invoice class below
        int count = 0;
        while(obj.hasNext()){
            System.out.println("Invoice taking...");
            System.out.println("str Enter part Number:");
            invoices[count].partNumber = obj.next();
            System.out.println("str Enter part Description:");
            invoices[count].partDescription = obj.next();
            System.out.println("int Enter part quantity");
            invoices[count].quantity = obj.nextInt();
            System.out.println("int Enter part price");
            invoices[count].pricePerItem = obj.nextInt();
            System.out.println("Invoice complete");
       }

       for(int i=0;i<count;i++){
        System.out.println(invoices[i].getInvoiceAmount());
       }

    }
}

class Invoice{
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    Invoice(String partNumber, String partDescription, int quantity){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = 0;
    }
    Invoice(String partNumber, String partDescription){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = 0;
        this.pricePerItem = 0;
    }
    Invoice(String partNumber){
        this.partNumber = partNumber;
        this.partDescription = "";
        this.quantity = 0;
        this.pricePerItem = 0;
    }

    String getPartNumber(){
        return this.partNumber;
    }
    String getPartDescription(){
        return this.partDescription;
    }
    int getQuantity(){
        return this.quantity;
    }
    Double getPricePerItem(){
        return this.pricePerItem;
    }

    void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    void setQuantity(int quantity){
        if(quantity>=0){
        this.quantity = quantity;}
        else{
            this.quantity = 0;
        }
    }
    void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }

    Double getInvoiceAmount(){
        return this.quantity * this.pricePerItem;
    }

}
