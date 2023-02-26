public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer(17999, "Narmina", 25);
        System.out.println(cust.getID());
        System.out.println(cust.getName());
        System.out.println(cust.getGender());
        System.out.println(cust.getDiscount());
        System.out.println(cust.toString());

        Account acc = new Account(15678, cust);
        System.out.println(acc.getID());
        System.out.println(acc.getCustomerName());
        System.out.println(acc.getBalance());
        acc.setBalance(1000);
        System.out.println(acc.deposit(25.0));
        System.out.println(acc.withdraw(200));


    }
}
