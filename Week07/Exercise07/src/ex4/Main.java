package ex4;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(143122, "Alan", 'm');
        Account a1 = new Account(1535, c1, 150);

        try {
            a1.withdraw(200);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(a1.getBalance());
    }
}
