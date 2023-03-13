package pp2.week03.ex03;

public class Main {
 
    public static void main(String[] args) {
        try {
            Account account = new Account(100.0);
            account.withdraw(200.0);
            double balance = account.getBalance();
            System.out.println("Balance: " + balance);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}