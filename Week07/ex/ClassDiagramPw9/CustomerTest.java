package ClassDiagramPw9;

public class CustomerTest {
    public static void main(String[] args) {
        
        //Customer cus = new Customer(16882, "Laman", "f");

       // Account ac = new Account(16882, f, 100.00);

        try{
              //ac.getBalance();  
            System.out.println();
        } catch(InvalidAmountException e) {
            System.out.println("Invalid!");
            System.out.println(e.getMessage());
        }
    }
}
