public class MainAccount {

    public static void main(String[] args) {
     Customer c=new Customer(111,"lime", 'f');
 
     Account a = new Account(16068, c,890);
 
      try {
         a.withdraw(500).deposit(78);
      } catch (InvalidAmountException ex) {
         System.out.println(ex.getMessage());
      }
 
      System.out.println(a.getBalance());
 
 
    }
     
     }