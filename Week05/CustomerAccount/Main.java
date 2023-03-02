package Week05.CustomerAccount;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(2,"Garib", 'm');
        Customer c = new Customer(13,"Garib", 40);

        System.out.println(c.getGender());
        System.out.println(c.toString());

        Account a = new Account(5, c, 500);

        System.out.println(a.withdraw(50).deposit(100).toString());

        System.out.println(a.getId());
        System.out.println(c.getID());

        System.out.println(a.deposit(600).toString());


    }
}
