public class Main2 {
    public static void main(String[] args) {
        Account account = new Account(100.0);

        try {
            account.withdraw(200.0);
        } catch (InvalidAmountException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Balance: " + account.getBalance());
    }
}
