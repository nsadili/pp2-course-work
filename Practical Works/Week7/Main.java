package Week7;

public class Main {
    public static void main(String[] args) {
        try {
            Account account = new Account(1000.0);
            account.withdraw(500.0);
        } catch (InvalidAmountException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
