public class TestAccount {
    public static void main(String[] args) {
        Customer c = new Customer(1, "Vasila", 4);

        Account a = new Account(16144, c, 3000);

        System.out.println("Balance: " + a.toString());

        a.deposit(300.0);

        System.out.println("After deposit: " + a.getBalance());

        try {
            a.withdraw(50.0);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Balance after withdraw: " + a.getBalance());
        }
    }

    
}