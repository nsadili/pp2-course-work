package Week08.pw;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

 class Account implements Comparable<Account>{

    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getfirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getbalance(){
        return balance;
    }

    @Override
    public int compareTo(other) {
        int fullName = (this.firstName + this.lastName).compareTo(other.getfirstName() + other.getLastName());
        if (fullName != 0) {
            return fullName;
        }
        return Double.compare(this.balance, other.getbalance());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ": $" + balance;
    }


public class AccountSorterNameLastNameBalance {
    public static void main(String[] args) {
        List<Account> accounts = List.of(
        new Account("John", "Doe", 1000.0),
        new Account("Alice", "Smith", 750.0),
        new Account("Bob", "Johnson", 2000.0),
        new Account("Alice", "Johnson", 1500.0)
);
        
        
    }
}
 } 

    
      


    

