public class TestEx9 {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer(16238, "Vusal", 'm', 20);
        Account account1 = new Account(12233, costumer1, 20000.0);
        System.out.println(costumer1.getID());
        System.out.println(costumer1.toString());

        System.out.println(account1.getBalance());
        System.out.println(account1.toString());
        System.out.println("New balance " + account1.deposit(20).getBalance());

        System.out.println(account1.withdraw(25000.0).getBalance());
        
    }
}
