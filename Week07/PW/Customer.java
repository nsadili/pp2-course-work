package PW;

public class Customer {
    public static void main(String[] args) {
        try {
            Account account = new Account("ACC001", 500.0);
            System.out.println("Initial balance: " + account.getBalance());

            account.withdraw(100.0);
            System.out.println("After withdraw: " + account.getBalance());

            // Throws InvalidAmountException
            account.withdraw(600.0);
        } catch (InvalidAmountException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}