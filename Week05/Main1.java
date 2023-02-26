public class Main1 {
    public static void main(String[] args) {
        Customer C = new Customer(14086, "Vusat", 5);

        Account A1 = new Account(14086, C, 100.0);
        System.out.println(A1.toString());
    }
}
