package Week07.Ex4;

public class InvalidAmountException extends RuntimeException {
    private String msg;

    public InvalidAmountException(String string) {
        msg = string;
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return msg;
    }

}
