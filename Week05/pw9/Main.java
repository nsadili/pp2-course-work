package WEEK5.pw9;

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
    
        acc.withdraw(60);

        System.out.println(acc.getBalance());
    
    }
}
