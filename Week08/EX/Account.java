package Week08.EX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Account implements Comparable<Account> {
    private  String firstName;
    private String lastName;
    private Double balance;

    public Account(String firstName, String lastName, double balance){
        this.firstName=firstName;
        this.lastName=lastName;
        this.balance=balance;

    }
    public String String () {
        return String.format("Account: [Firstname: %s , Lastname: %s , balance: %.2f]", firstName, lastName, balance);
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Double getBalance() {
        return balance;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
   
    @Override
    public int compareTo(Account o) {

       if(firstName.compareTo(o.firstName)!=0) {
        return firstName.compareTo(o.firstName);
       }

       return lastName.compareTo(o.lastName);
    }
    public static void printAcc(ArrayList<Account> acc) {
    }
    
}
class Main{

    public static void main(String[] args) {
        
        ArrayList<Account> acc = new ArrayList<>();

        acc.add(new Account("Leyla", "Huseynova", 1000));
        acc.add(new Account("Rustam", "Aliyev", 2000));
        
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