public class Main {
    public static void main(String[] args) {
        Account account = new Account(5500.0);
        double amountToWithdraw = 6500.0;

        try {
            account.withdraw(amountToWithdraw);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}