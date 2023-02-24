package Week05.pw;

public class AccountAndCustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer(637456, "Taghi", 'm', 50);
        System.out.println(c.toString());
        Account acc1 = new Account(600, c);
        System.out.println(acc1.toString());
        Account acc2 = acc1.deposit(84756.83747);
        System.out.println(acc2.toString());
        acc2.withdraw(1003000.5678);
        Account acc3 = acc2.withdraw(8634.8734);
        System.out.println(acc3.toString());
    }
}
