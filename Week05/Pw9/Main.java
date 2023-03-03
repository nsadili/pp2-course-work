package Week05.Pw9;

public class Main {
    public static void main(String[] args) {
        Costumer c1 = new Costumer(001, "Asif", 50);
        Costumer c2 = new Costumer(002, "Vasif", 35);
        Costumer c3 = new Costumer(003, "Agasif", 0);

        Account a1 = new Account(001, c1);
        Account a2 = new Account(002, c2, 1000);

        a1.deposit(900);
        a2.withdraw(18);

        Account a3 = new Account(003, c3, 0.2);
        a3.deposit(0.5);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

    }
}
