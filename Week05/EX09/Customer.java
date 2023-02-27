package Week05.EX09;

public class Customer {

    public Customer(int i, String string, char c, int j) {
    }

    public static void main(String[] args) {

        Customer customer1 = new Customer(16096, "Elnur Ismayilzade", 'M', 20);

        Account account1 = new Account(1001, customer1, 4000.0);

        System.out.println(account1.toString());

        account1.deposit(2000.0);

        System.out.println("New balance after deposit: " + account1.getBalance());

        account1.withdraw(1000.0);

        System.out.println("New balance after withdrawal: " + account1.getBalance());

        Customer customer2 = new Customer(2111, "Rashad Ismayilov", 'M', 10);

        Account account2 = new Account(1000, customer2);

        System.out.println(account2.toString());

        account2.withdraw(1000.0);

        System.out.println("New balance after withdrawal: " + account2.getBalance());

    }

    public String getName() {
        return null;
    }

}