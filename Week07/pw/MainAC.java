public class MainAC {
    public static void main(String[] args) throws InvalidAmountException {
        Customer c=null;
        Account a=null;
        try{
         c = new Customer(47,"Nariman", 10);
         a = new Account(4747,c,300.0);
        }catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        System.out.printf("ID(customer): %d\n", c.getID());
        System.out.printf("Name: %s\n", c.getName());
        System.out.println(c.toString());
        System.out.println();
        System.out.printf("ID(account): %d\n", a.getID());
        System.out.printf("Balance: $%.2f\n", a.getBalance());
        System.out.printf("Customer's Name: %s\n", a.getCustomerName());
        System.out.println(a.withdraw(500).toString());
    }
}
