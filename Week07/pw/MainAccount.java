public class MainAccount {

    public static void main(String[] args) {
     Customer c=new Customer(234,"Bahruz", 'm');
 
     Account a = new Account(345, c,768);
 
      try {
         a.withdraw(100).deposit(50);
      } catch (InvalidAmountException e) {
         System.out.println(e.getMessage());
      }
 
      System.out.println(a.getBalance());
 
 
    }
     
     
 
 
 
 
 
 
 
     
 }