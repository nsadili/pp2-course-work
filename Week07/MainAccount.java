public class MainAccount {

   public static void main(String[] args) {
    Customer c=new Customer(111,"Shamil", 'm');

    Account a = new Account(222, c,500);

     try {
        a.withdraw(600).deposit(50);
     } catch (InvalidAmountException e) {
        System.out.println(e.getMessage());
     }

     System.out.println(a.getBalance());


   }
    
    







    
}
