package Week07.Ex4;

public class Main {
    public static void main(String[] args) {


        try {
            Costumer c = new Costumer(90, "Cavidan Taghiyev", 5000);
            Account a = new Account(90, c, 5000);
            a.withdraw(6000);
            System.out.println(a.getBalance());
            
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
