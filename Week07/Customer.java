public class Customer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Account account = new Account(12345, customer, 100.0);

        try {
            account.withdraw(200.0);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}