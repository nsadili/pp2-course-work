package Week07;

public class InvalidUsernameException extends Exception {

    public InvalidUsernameException() {
        super();
    }

    public InvalidUsernameException(String message) {
        super(message);
    }
}