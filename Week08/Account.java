import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Account implements Comparable<Account> {

    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName,String lastName, double balance){
        this.lastName=lastName;
        this.firstName=firstName;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return String.format("Account: [Firstname: %s , Lastname: %s , balance: %.2f]", firstName, lastName, balance);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void printAcc(ArrayList<Account> acc){
        for(Account a : acc){
            System.out.println(a.toString());
        }
    }

    @Override
    public int compareTo(Account o) {

       if(firstName.compareTo(o.firstName)!=0) {
        return firstName.compareTo(o.firstName);
       }

       return lastName.compareTo(o.lastName);
    }
    
    
}


class Main{

    public static void main(String[] args) {
        
        ArrayList<Account> acc = new ArrayList<>();

        acc.add(new Account("Shamil", "Abbasov", 1000));
        acc.add(new Account("Seid", "Aliyev", 50));
        acc.add(new Account("Ferid", "Mammadiv", 10));
        acc.add(new Account("Rufet", "Saidov", 600));
        acc.add(new Account("Ali", "Faridov", 1050));
        acc.add(new Account("Shamil", "Qacarov", 2000));
        acc.add(new Account("Nariman", "Babashov", 1900));

        Account.printAcc(acc);

        Collections.sort(acc);
        System.out.println("----------- After Sorting----------");
        Account.printAcc(acc);
        // acc.sort(new Comparator<Account>() {

        //     @Override
        //     public int compare(Account o1, Account o2) {
        //        return (int)(o2.getBalance() - o1.getBalance());
        //     }
            
        // });

        Collections.sort(acc,new Comparator<Account>() {

            @Override
            public int compare(Account o1, Account o2) {

                return ((Double) o2.getBalance()).compareTo((Double) o1.getBalance());
                
            }
            
        });


        System.out.println("Sorting based on Balance"); // from maximum to minimum
        Account.printAcc(acc);

        



    }


}