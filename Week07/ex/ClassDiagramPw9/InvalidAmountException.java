package ClassDiagramPw9;
public class InvalidAmountException extends RuntimeException{
    
    public InvalidAmountException() {
        super();
    }

    public InvalidAmountException (String message) {
        super(message);
    }
}
