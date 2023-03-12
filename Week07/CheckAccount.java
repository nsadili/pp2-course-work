import account.*;

public class CheckAccount {
    public static void main(String args[]) {
        Customer customer=new Customer(345234,"name",'m',20);
        Account acc=new Account(254345, customer,634.34);
        try{
            System.out.println(acc.withdraw(626));
        } catch(InvalidAmountException e){
            System.out.println(e.getMessage());
            return;
        }
        
        System.out.println(customer.getGender());
    }
}
