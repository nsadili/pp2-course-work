package Week08;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Account {
//class Account implements Comparable<Account>{

    private String firstName, lastName;
    private Double balance;
    
    public Account(String firstName, String lastName, Double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
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


    public Double getBalance() {
        return balance;
    }


    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "firstname: " + firstName + " lastname: " + lastName + " balance: " + balance + "\n";
    }

    /*
    public int compareTo(Account a) {//for sorting based on balance
        if(this.balance > a.balance) return 1;
        else return -1; 
    }
    */

    /*
    public int compareTo(Account a) {//for sorting based on full name
        int compFirstName = firstName.compareTo(a.firstName)
        if(compFirstName != 0) return compFirstName;
        return lastName.compareTo(o.lastName);
    }
     */
}
public class ListOfAccounts {
    public static void main(String[] args) {
        LinkedList<Account> list = new LinkedList<>();

        list.add(new Account("Charles", "Dickens", 8.34));
        list.add(new Account("George", "Orwell", 6.27));
        list.add(new Account("Leo", "Tolstoy", 10.2));
        list.add(new Account("Ernest", "Hemingway", 12.34));
        list.add(new Account("Mark", "Twain", 3.45));

        for(Account a: list) {
            System.out.println(a);
        }

        //Collections.sort(list);
        //System.out.println("The list sorted lexicogrphically : \n");
        /* 
        for(Account a: list) {
            System.out.println(a);
        }
        */

        Collections.sort(list, new Comparator<Account> () {
            @Override
            public int compare(Account o1, Account o2) {
                return o2.getBalance().compareTo(o1.getBalance());
            }

        });

        for(Account a: list) {
            System.out.println(a);
        }
    }
}
