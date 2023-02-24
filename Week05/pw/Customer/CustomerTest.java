package pw.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(16231, "Rufat", 'm', 40);
        Customer c2 = new Customer(15978, "Arzum", 'f', 30);

        System.out.println("Customer 1 ID number: "+c1.getId());
        System.out.println("Customer 1 name: "+c1.getName());
        System.out.println("Customer 1 gender: "+c1.getGender());
        System.out.println("Customer 1 toSTring function: "+ c1.toString());

        System.out.println();

        System.out.println("Customer 2 ID number: "+c2.getId());
        System.out.println("Customer 2 name: "+c2.getName());
        System.out.println("Customer 2 gender: "+c2.getGender());
        System.out.println("Customer 2 toSTring function: "+ c2.toString());

        System.out.println();
        System.out.println();

        Account ac1= new Account(231, c1, 750);

        System.out.println("Account 1 ID number: "+ ac1.getId());
        System.out.println("Account 1 Customer: "+ ac1.getCustomer());
        System.out.println("Account 1 balance: "+ ac1.getBalance());
        System.out.println("Account 1 Customer name: "+ ac1.getCustomerName());
        System.out.println("Account 1 in string format: "+ac1.toString());

        System.out.println();
        
        ac1.deposit(100);
        System.out.println("Account 1 balance after deposit(100) function: "+ ac1.getBalance());

        System.out.println();
        
        ac1.withdraw(200);
        System.out.println("Account 1 balance after withdraw(200) function: "+ ac1.getBalance());

        System.out.println();

        ac1.withdraw(1000);
        System.out.println("Account 1 balance after withdraw(1000) function: "+ ac1.getBalance());
    }
}
