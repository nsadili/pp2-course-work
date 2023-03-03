package pwExercises.customerAccount;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(12875, "Amal", 'm');
        System.out.println(c.getID());
        System.out.println(c.getName());
        System.out.println(c.getGender());
        System.out.println(c.toString());

        Account a = new Account(12345, c, 100.0);
        System.out.println(a.getID());
        System.out.println(a.getCustomer()); // Customer@hashcode
        System.out.println(a.getBalance());
        System.out.println(a.toString());

        a.setBalance(2000.0);
        System.out.println(a.getBalance());

        System.out.println(a.getCustomerName());

        a.deposit(500.0).withdraw(2000.0).withdraw(500.0);
        System.out.println(a.getBalance());
    }
}
