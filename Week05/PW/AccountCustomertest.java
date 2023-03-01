public class AccountCustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer(18018, "Laman", 'f' );
        System.out.println(c.toString());
        Account acc1 = new Account();
        System.out.println(acc1.toString());
        Account acc2 = acc1.deposit();
        System.out.println(acc2.toString());
        acc2.withdraw();
        Account acc3 = acc2.withdraw();
        System.out.println(acc3.toString());
    }
}