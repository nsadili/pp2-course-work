public class TestAccount {
    public static void main(String[] args) {
        Customer c = new Customer(0, null, 0, 0);
        Account a = new Account(0, c);

        System.out.println("Balance: " + a.toString());
        a.deposit(100.0);
        System.out.println("Balance after deposit: " + a.getBalance());

        try {
            a.withdraw(120.0);
        } finally {
            System.out.println("Balance after withdraw: " + a.getBalance());
        }
    }

    
}