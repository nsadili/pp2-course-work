import java.util.Scanner;
import Account.Account;
import Account.Customer;
import Account.InvalidAmountException;
public class CustomerTest {
    public static void main(String[] args) {
       



        Customer c1= new Customer(16086,"Ibrahim", 'm');
        Customer c2= new Customer(15076, "Arzu",'f');
        
        System.out.println("First customer: " + c1.toString());

        System.out.println("Second customer: " + c2.toString());
       
        
        Account a1= new Account(157, c1,10000.0);
        Account a2= new Account(167, c2,15000.0);
        System.out.println("The final balance after some changes: ");
         // It will check first account and handle exception if we have
        try{
        System.out.println(a1.withdraw(80).deposit(200).toString());
      
        } catch(InvalidAmountException e){
            System.out.println("You can not do actions! Please check your balance again");
        }


        // It will check second account and handle exception because withdraw>balance(witdraw = 50000 but balance = 15000)
        try{
        System.out.println(a2.withdraw(50000).deposit(3000).toString());
        } catch(InvalidAmountException e){
        System.out.println("Mrs.Arzu, You can not do actions! Please check your balance again.");
        }
  
  

     
        




        
    }
}