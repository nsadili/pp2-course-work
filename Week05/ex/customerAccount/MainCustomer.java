package customerAccount;

public class MainCustomer {
    public static void main(String[] args) {
        Customer c=new Customer(111,"Shamil", 'm');

        Customer c2=new Customer(22, "Nariman" , 50);

        System.out.println(c.getGender());
        System.out.println(c.toString());

        Account a=new Account(55, c, 456);

        System.out.println(a.withdraw(56).deposit(100).toString());

        System.out.println(a.getId());
        System.out.println(c.getId());

        System.out.println(a.deposit(1000).toString());


    }
}
