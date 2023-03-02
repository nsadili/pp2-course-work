package Week05.PW;

public class pw9 {
    public static void main(String[] args) {

        Customer customer = new Customer("John", 50, 'm');
        Account account = new Account(20.0 , 1234 , customer);

        System.out.println(customer.toString());
        System.out.println(account.toString());

        System.out.println(account.deposit(20.0));
        System.out.println(account.withdraw(20.0));
        
    }
}