package Week05.EX09;

public class main {

    public static void main(String[] args) {

        Customer customer = new Customer(1, "Ilkin Alishov", 'M', 0);

        Account account = new Account(16120, customer, 750);

        System.out.println(account);

        account.deposit(500);

        System.out.println(account);

        account.withdraw(200);

        System.out.println(account);

        String customerName = account.getCustomerName();
        System.out.println(customerName);

    }

}
