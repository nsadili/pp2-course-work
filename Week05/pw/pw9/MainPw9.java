package pw9;

public class MainPw9 {
    
    public static void main(String[] args) {
        
        Customer customer1 = new Customer(14949, "Rashad", 'm');
        Customer customer2 = new Customer(19494, "Nuray", 'f');

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

        Account account1 = new Account(149, customer1, 4900.00);
        Account account2 = new Account(194, customer1, 9400.00);

        System.out.println(account1.withdraw(49).deposit(94).toString());
        System.out.println(account2.withdraw(494).deposit(949).toString());
    }
}
