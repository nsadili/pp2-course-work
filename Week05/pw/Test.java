public class Test {

    public static void main(String[] args) {
        Customer c = new Customer(17382, "Murad", 'm', 50);
        System.out.println(c.toString());
        Account ac1 = new Account(125, c);
        System.out.println(ac1.toString());
        Account ac2 = ac1.deposit(120000);
        System.out.println(ac2.toString());
        ac2.withdraw(25000);
        Account ac3 = ac2.withdraw(13000);
        System.out.println(ac3.toString());
    
}
}