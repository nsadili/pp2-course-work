public class AccountTest {
    public static void main(String[] args) {
        
        Customer customer = new Customer(14949, "Rashad", 'm');

        Account account = new Account(494, customer, 940);

        try {

            account.withdraw(400).deposit(90);
        } 
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
         }
    
         System.out.println(account.getBalance());
    }
}