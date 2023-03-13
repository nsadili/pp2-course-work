package Week07;

import java.util.Scanner;

public class InvoiceTest {
   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    // Invoice [] invoices=new Invoice[3];
    // for(int i=0;i<invoices.length;i++){
    //     int quantity=scn.nextInt();
    //     double price=scn.nextDouble();
    //     invoices[i]= new Invoice(null, null, quantity, price);
    // }
    // for(Invoice i: invoices){
       
    //     System.out.println(i.getInvoiceAmount());
    // }
    
    Invoice first = new Invoice("C5", "Computer", 12, 1750);
    try{
    
    System.out.println("Set the quantity: ");
    first.setQuantity(scn.nextInt());
    System.out.println("Set the price of the product: ");
    first.setPrice(scn.nextDouble());
    System.out.println("Part number: "+ first.getNumber()+"\n"+"Part description: "+first.getDescription()+
    "\n"+"Part quantity: "+first.getQuantity()+"\n"+"Part price: "+first.getPrice()+" $");
    
    System.out.println("Invoice Amount: "+ first.getInvoiceAmount()+" $");
    }
    catch(IllegalArgumentException e){
        System.out.println("Error: "+e.getMessage());
    }
    }
}