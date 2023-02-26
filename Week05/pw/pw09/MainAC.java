package pw09;

public class MainAC {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1001, "Henry", 'M');
        Customer customer2 = new Customer(1002, "Susan", 'F');
    
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    
        Account account1 = new Account(101, customer1, 500.0);
        Account account2 = new Account(102, customer2);
    
        System.out.println(account1.getCustomer().getName() + " has balance: " + account1.getBalance());
        System.out.println(account2.getCustomer().getName() + " has balance: " + account2.getBalance());
    
        account1.setBalance(1000.0);
        System.out.println(account1.getCustomer().getName() + " has balance: " + account1.getBalance());
    
        account1.setBalance(-500.0);
        System.out.println(account1.getCustomer().getName() + " has balance: " + account1.getBalance());
    }
    
}
