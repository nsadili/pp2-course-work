public class Main {
    public static void main(String[] args) {
        Customer Samad = new Customer(16014, "Samad", 'm');
        Account account = new Account(16014, Samad , 1000);
        account.deposit(200);

        System.out.println(account.toString());
    }
}