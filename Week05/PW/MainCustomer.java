public class MainCustomer {
    public static void main(String[] args) {
        Customer c=new Customer(076 ,"Nasib", 'm');

        System.out.println(c.getGender());
        System.out.println(c.toString());

        Account a=new Account(52, c, 323);

        System.out.println(((Account) a.withdraw(25)).deposit(100).toString());

        System.out.println(a.getId());
        System.out.println(c.getId());

        System.out.println(a.deposit(1000).toString());


    }
}