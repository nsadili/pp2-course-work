

public class MainTest {
    public static void main(String[] args) {
        
    
    Customer customer = new Customer(11, "Roya Alizada", 10);
    Account account = new Account(1, customer, 170.0);
    account.deposit(10.0).withdraw(15.0);
    System.out.println(account.getBalance());
    System.out.println(account.toString()); 
    System.out.println(customer.getName());
    System.out.println(customer.getID());
    System.out.println(customer.toString());
    }
}
