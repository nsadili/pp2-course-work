package ClassDiagramPw9;
public class InvalidAmountException extends RuntimeException{
    
    public InvalidAmountException() {
        super("Invalid amount exc");
    }

    public InvalidAmountException (String message) {
        super(message);
    }
}
