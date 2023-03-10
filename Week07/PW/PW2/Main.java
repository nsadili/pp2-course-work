package PW2;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(1, "Efqan Talibov", 'M', 50);

        Account account = new Account(160966, customer, -250);

        System.out.println(account);

        account.deposit(-500);

        System.out.println(account);

        account.withdraw(300);

        System.out.println(account);

        String customerName = account.getCustomerName();
        System.out.println(customerName);

    }

}