public class Main {
    public static void main(String[] args) {
        Account account = new Account(500);

        try {
            System.out.println("Initial balance: " + account.getBalance());
            account.deposit(100);
            System.out.println("Balance after deposit: " + account.getBalance());
            account.withdraw(200);
            System.out.println("Balance after withdrawal: " + account.getBalance());
            account.withdraw(600); // This will throw an InvalidAmountException
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
