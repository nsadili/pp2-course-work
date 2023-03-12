package account;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String s) {
        super(s);
    }
}
