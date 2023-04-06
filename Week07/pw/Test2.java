public class Test2 {
    public static void main(String[] args) {
        try {
            Customer2 c = new Customer2(17382, "Murad", 'm', 20);
            System.out.println(c.toString());
            Account2 acc1 = new Account2(125, c);
            System.out.println(acc1.toString());
            Account2 acc2 = acc1.deposit(10000);
            System.out.println(acc2.toString());
            Account2 acc3 = acc2.withdraw(5000);
            System.out.println(acc3.toString());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
    }
}