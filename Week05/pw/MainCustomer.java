package customerAccount;

public class MainCustomer {
    public static void main(String[] args) {
        Customer c1=new Customer(69,"Bahruz", 'm');

        Customer c2=new Customer(31, "Yusuf" , 50);

        System.out.println(c1.getGender());

        System.out.println(c1.toString());

        Account x=new Account(100, c1, 567);

        System.out.println(x.withdraw(34).deposit(105).toString());

        System.out.println(x.getId());

        System.out.println(c1.getId());

        System.out.println(x.deposit(1000).toString());


    }
}
