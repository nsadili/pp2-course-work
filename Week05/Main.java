public class Main {
    public static void main(String[] args) {
       customer elnar = new customer(16260, "Elnar", 'm');
       Account account = new Account(5453, elnar, 12344);
       account.deposit(123);

        System.out.println(account.toString());
    }
}