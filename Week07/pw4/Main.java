package Week07.pw4;

public class Main {
    public static void main(String[] args){
        Account acc=new Account(0, null, "f", 0, null, 0);

        acc.setGender("m");
        acc.setID(1234);
        acc.setName("Alewka");
        acc.setBalance(350.0);
        acc.setAccID(4321);
        
        System.out.println(acc.getBalance());

        acc.deposit(50);

        System.out.println(acc.getBalance());
    
        try{
            acc.withdraw(600);
        }
        catch(InvalidAmountException e){
            System.out.println(e);
        }
        System.out.println(acc.getBalance());
    
    }
}
