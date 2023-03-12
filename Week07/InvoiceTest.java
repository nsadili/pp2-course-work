
import java.util.Scanner;

import invoice.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Invoice test = null;
        try{  
             test=new Invoice(input.nextLine(),input.nextLine(), input.nextInt(),input.nextDouble());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }

        System.out.printf("Invoice Amount is %f\n",test.getInvoiceAmount());

        test.setDescription(input.next());
        
        try{
            test.setNumber(input.next());
            test.setPurchased(input.nextInt());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }
        
        test.setPrice(input.nextDouble());
       

        System.out.printf("Parameters: %s %s %f %d",test.getDecription(),test.getNumber(),test.getPrice(),test.getPurchased());


    }
}
