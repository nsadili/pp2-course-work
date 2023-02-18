import java.util.Scanner;


public class InvoiceTest {
    public static void main(String[] args) {

           // Invoice i=new Invoice("ALfa","Beta",10,5);

            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter the number of Invoices: ");
            int numOfInvoice=sc.nextInt();

            double[] invoiceAmount=new double[numOfInvoice];

            for(var i=0;i<numOfInvoice;i++){

                System.out.printf("Please enter the number of quantity for %d.th invoice: \n",i+1);
                var numOfQuantity=sc.nextInt();
                System.out.printf("Please enter the price for %d.th invoice: \n",i+1);
                var numOfPrice=sc.nextDouble();

                invoiceAmount[i]= new Invoice(numOfQuantity,numOfPrice).getInvoiceAmount();
       
            
            }

            for(var i=0;i<invoiceAmount.length;i++){
                System.out.printf("%d. invoice amount: %.2f\n",i+1,invoiceAmount[i]);
            }


            



            

        
        

    
    }
}
