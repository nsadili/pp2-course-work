package pp2.week05;

public class Test09ex {
    public static void main(String[] args) {
        Customer one = new Customer(12196, "Khavar", 'f');
        System.out.println(one.toString());
        Account first = new Account(16363, one, 200);
        System.out.println(first.toString());
        Account sec = first.deposit(387483829.22);
        System.out.println(sec.toString());
        sec.withdraw(2742297492.555);
        Account third = sec.withdraw(7827183.9999);
        System.out.println(third.toString());
    }
}
