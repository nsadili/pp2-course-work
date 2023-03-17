package Week05.geometryy;
import  week05.geometryy.Account;
import  week05.geometryy.Costumer;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(18008,  "Ismayil Ismayilov", 10);
        
        System.out.println(customer.getID()); 
        System.out.println(customer.getName()); 
        customer.setName("Ismayil Ismayilov");
        System.out.println(customer.getName()); 
        System.out.println(customer.getDiscount()); 
        
        System.out.println(customer.toString("Ismayil Ismayilov")); 
        
        Account account = new Account(456, customer, 1000.0);
        
        System.out.println(account.getID()); 
        System.out.println(account.getCustomer().getID()); 
        System.out.println(account.getBalance()); 
        account.setBalance(2000.0);
        System.out.println(account.getBalance()); 
        
        System.out.println(account.toString()); 
}
}
