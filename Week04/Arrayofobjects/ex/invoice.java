package Arrayofobjects.ex;

import java.util.Scanner;

public class invoice {
    



    public static void main(String[]args){

       Scanner scan= new Scanner(System.in);
        int quantity=scan.nextInt();
        int price=scan.nextInt();
        
        invoice(quantity,price);
    }


    public static void invoice(int quantity,int price){
    int invoice=quantity*price;
    System.out.print("Invoice Total: "+ invoice);

    }



}
