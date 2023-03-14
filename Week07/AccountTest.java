package Week07;

public class AccountTest {
    public static void main(String[] args){
        Customer c1 = new Customer(13148, "Naik", 'm');
        Account a1 = new Account(13148, c1, 666.66);
        
        System.out.println(a1.toString());


        try{
            a1.withdraw(700.00);
        }catch (InvalidAmountException e){
            e.getStackTrace();
        }
    }
}
