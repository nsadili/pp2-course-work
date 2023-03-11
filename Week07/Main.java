package Week07;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(12345, 34534);
        try
        {
            account.withdraw(95687657);
        }
        catch (InvalidAmountException exception)
        {
            System.out.println(exception);
        }


        try
        {
            Invoice invoice = new Invoice("partNumber", "partDescription", -100, -1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
        }
    }
}
