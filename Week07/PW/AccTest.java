package Week07.PW;


public class AccTest {
    public static void main(String[] args) {

        Customer1 customer = new Customer1("John", 50, 'm');
        Account1 account = new Account1(20.0 , 1234 , customer);

        System.out.println(customer.toString());
        System.out.println(account.toString());

        System.out.println(account.deposit(20.0));
        
        try {
            account.withdraw(1500.0);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}