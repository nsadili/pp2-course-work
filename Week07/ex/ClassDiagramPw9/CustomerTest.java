package ClassDiagramPw9;

public class CustomerTest {
    public static void main(String[] args) {

        Customer cus = new Customer(16882, "Laman", 'f');

        Account ac = new Account(16882, cus, 100.00);

        try {
            ac.withdraw(200);

            System.out.println("Success");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
            System.out.println("Operation failed");
        }
    }
}
