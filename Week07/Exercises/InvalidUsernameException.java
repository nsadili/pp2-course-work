package Week07.Exercises;

public class InvalidUsernameException extends Exception {
    public InvalidUsernameException() {
        super();
    }

    public InvalidUsernameException(String message) {
        super(message);
    }
}
