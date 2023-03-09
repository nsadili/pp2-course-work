package Week05.pw;

public class AccountCustomerTest {
    public static void main(String[] args) {
        try {
            Customer c = new Customer(123, "Zaur", 'm', 20);
            System.out.println(c.toString());
            Account acc1 = new Account(125, c);
            System.out.println(acc1.toString());
            Account acc2 = acc1.deposit(1000000.5678);
            System.out.println(acc2.toString());
            // acc2.withdraw(1003000.5678);
            Account acc3 = acc2.withdraw(68832.09);
            System.out.println(acc3.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
