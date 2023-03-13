public class Main {
    public static void main(String[] args) {
        Account account = new Account("123", 1000.0);
        try {
            account.withdraw(1500.0);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
