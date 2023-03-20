package Account;

public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Customer cus = new Customer(1, "John", 10);

        Account a = new Account(2, cus, 1000);

        System.out.println("Balance: " + a.toString());

        a.deposit(500.0);

        System.out.println("After deposit: " + a.getBalance());

        try 
        {
            a.withdraw(40.0);
        } 
        catch (InvalidAmountException e) 
        {
            e.printStackTrace();
        } 
        finally
        {
            System.out.println("Balance after withdraw: " + a.getBalance());
        }
    }

    
}
