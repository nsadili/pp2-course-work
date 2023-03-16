public class AccountException {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer(16238, "Vusal", 'm', 20);
    Account account1 = new Account(12233, costumer1, 20000.0);

    try
    {
        account1.withdraw(30000.0);
    }catch(
    IllegalAccountException a)
    {
        System.out.println(a.getMessage());
    }
    }
}
