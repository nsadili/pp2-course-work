import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListOfAccounts {
    public static void main(String[] args){
        List<Account> myList = new ArrayList<>(
            List.of(
                new Account("islam", "ibra", 1000.0),
                new Account("islasadm", "bla", 1700.0),
                new Account("igsslam", "ibrla", 100.0),
                new Account("islasfm", "iadbra", 2000.0)
            )
        );

        // System.out.println(myList);
        
        Collections.sort(myList);
        // System.out.println(myList);
        printList(myList);
    }

    static void printList(List<Account> list){
        for(Account el: list){
            System.out.println(el);
        }
    }
}


class Account implements Comparable<Account>{
    private String name;
    private String lastname;
    private double balance;

    Account(String name, String lastname, double balance){
        this.name = name;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", lastname=" + lastname + ", balance=" + balance + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Account o) {
        int compFisrtName = this.name.compareTo(o.name);
        if(compFisrtName !=0)
        return compFisrtName;

        return lastname.compareTo(o.lastname);
    } 

    
}