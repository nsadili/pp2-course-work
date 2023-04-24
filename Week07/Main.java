package Week07;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100.0);
        try {
            account.withdraw(50.0);
            System.out.println("Updated balance: " + account.getBalance());
            account.withdraw(100.0);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
