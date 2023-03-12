package Week07.PracticalWorks;

public class Main {
    public static void main(String[] args) {
        //Invoice
        try{
            Invoice invoice=new Invoice("12","Descript",-4,8);

        }
        catch (IllegalArgumentException e){
            System.out.println("You cannot use negative numbers");
        }
        //Account
        try{
        Account account=new Account(14234,2300);
        account.withdraw(2301);
        }
        catch (InvalidAmountException iae){
            System.out.println("Amount cannot be more than the balance.");
        }

    }
}
