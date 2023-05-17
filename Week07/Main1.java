public class Main1 {
    public static void main(String[] args) {
        try {
            Account account = new Account(1000.0);
            account.withdraw(1500.0);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
