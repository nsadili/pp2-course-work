package Week07;
import Week05.Customer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws InvalidAmountException {
        try{
            Invoice2 invoice = new Invoice2("50", "book", -20, 10);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e + ": Item Quantity can not be less than 0!");
        }
        try{
            Invoice2 invoice = new Invoice2("50", "book", 20, -10);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e + ": Price per item can not be less than 0!");
        }

        Customer customer = new Customer(14066, "Eljan", 'm');
        AccountClone account = new AccountClone(14066, customer, 1000);

        System.out.println("Balance before deposit: " + account.getBalance() + "$");
        account = account.deposit(500);
        // sets account equal to new account with updated balance returned in deposit function
        System.out.println("Balance after deposit: " + account.getBalance() + "$\n");


        System.out.println("Tyring to withdraw more than balance");
        try{
            account = account.withdraw(2000);
        } catch (InvalidAmountException e){
            System.out.println(e);
        }


        System.out.println("Account information before withdrawal:\n" + account);
        account = account.withdraw(1000);
        System.out.println("Account information after withdrawal:\n" + account);
    }
}