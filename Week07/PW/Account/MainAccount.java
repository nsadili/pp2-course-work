package Account;

public class MainAccount {
    public static void main(String[] args){
        Customer c = new Customer(16,"Nasib", 35);

        System.out.println(c.getGender());
        System.out.println(c.toString());

        Account a = new Account(10, c, 500);

        System.out.println(a.withdraw(50).deposit(100).toString());

        System.out.println(a.getId());
        System.out.println(c.getID());

        System.out.println(a.deposit(600).toString());
    }
}

