
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        Invoice Test=new Invoice(input.nextLine(),input.nextLine(), input.nextInt(),input.nextDouble());
        System.out.printf("Invoice Amount is %f\n",Test.getInvoiceAmount());

        Test.setDescription(input.next());
        Test.setNumber(input.next());
        Test.setPurchased(input.nextInt());
        Test.setPrice(input.nextDouble());
       

        System.out.printf("Parameters: %s %s %f %d",Test.getDecription(),Test.getNumber(),Test.getPrice(),Test.getPurchased());


    }
}
