package week07;

public class Main {

    public static void main(String[] args) {

//        testInvoice();
        testAccount();
    }

    private static void testInvoice() {
        try {
            Invoice invoice1 = new Invoice("1", "monitor", 2, 120.5);
            Invoice invoice2 = new Invoice("1", "monitor", -2, 120.5);
            Invoice invoice3 = new Invoice("1", "monitor", 2, -120.5);

            System.out.println(invoice1);
            System.out.println(invoice2);
            System.out.println(invoice3);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void testAccount() {
        try {
            Account account1 = new Account(123, new Customer(), 100.0);

            account1.withdraw(120.0);

            System.out.println(account1);
        } catch (InvalidAmountException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
