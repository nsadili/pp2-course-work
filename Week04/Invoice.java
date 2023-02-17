package Week04;

import java.util.Scanner;

public class Invoice {
    private String partNumber; 
    private String partDescr; 
    private  int quantity;
    private double price; 

    public Invoice (String partNumber, String partDescr, int quantity, double price) {
        
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.partDescr = partDescr;
        this.price = price;

        if(quantity < 0)
            this.setQuantity(0);

        if (price < 0)
            this.price = 0;

    }

    public String getPartNumber() {
        return partNumber;
    }

    public   int getQuantity2(){
        return this.quantity;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescr() {
        return partDescr;
    }

    public void setPartDescr(String partDescr) {
        this.partDescr = partDescr;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        
        if (quantity < 0)
            this.quantity = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;

        if (price < 0)
            this.price = 0;
    }

    public double getInvoiceAmount(){
        return price * quantity;
    }

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
        
    Invoice [] invoices = new Invoice[3];
    for (int i = 0; i < invoices.length; i++)
    {
        int quantity = scn.nextInt();
        double price = scn.nextDouble();

        invoices[i] = new Invoice(null, null, quantity, price);
    }
    int counter = 0;
    for (Invoice i : invoices){
        System.out.println(counter + " " + i.getQuantity());
        counter ++;

    }
  }
}