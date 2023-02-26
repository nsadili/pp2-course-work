import bank.*;

public class BankTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "John", 'M');
        Customer c2 = new Customer(2, "Mary", 'F');
        Account a1 = new Account(1, 1000, c1);
        Account a2 = new Account(2, 2000, c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(a1);
        System.out.println(a2);
    }
}
