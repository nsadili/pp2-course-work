public class AccountCustomertest {
    public static void main(String[] args) {
        Customer customer = new Customer(31, "pendir", "m");

        Account account = new Account(600, customer, 500.0);

        System.out.println(account);
    }
}