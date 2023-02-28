public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John", 'm');
        System.out.println(customer.getID()); 
        System.out.println(customer.getName()); 
        System.out.println(customer.getGender()); 
        System.out.println(customer.toString()); 

        Account account = new Account(1001, customer, 100.0);
        System.out.println(account.getID()); 
        System.out.println(account.getCustomer()); 
        System.out.println(account.getBalance()); 
        System.out.println(account.toString()); 

        account.setBalance(200.0);
        System.out.println(account.getBalance()); 

        System.out.println(account.getCustomerName()); 

        account.deposit(50.0);
        System.out.println(account.getBalance()); 

        account.withdraw(100.0);
        System.out.println(account.getBalance()); 

        account.withdraw(200.0); 
    }
}
