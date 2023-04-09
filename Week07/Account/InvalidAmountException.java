package Account;

public class InvalidAmountException extends Exception 
{
    public InvalidAmountException() {
        super("Invalid amount");
    }
}
