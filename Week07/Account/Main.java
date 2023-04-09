package Account;

public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Customer a = new Customer(2, "John", 10);

        Account b = new Account(2, a, 1000);

        System.out.println("Balance: " + a.toString());

        b.deposit(500.0);

        System.out.println("After deposit: " + b.getBalance());

        try{
            b.withdraw(20.0);
        } catch (InvalidAmountException e) 
        {
            e.printStackTrace();
        } finally
        {
            System.out.println("Balance after withdraw: " + b.getBalance());
        }
    }

    
}
