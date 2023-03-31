package listofaccounts;
import java.util.Comparator;
public class Account {
    private String firstname;
    private String lastname;
    private double balance;

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getBalance() {
        return balance;
    }

    public static Comparator<Account> CompareBalance = new Comparator<Account>() {
        @Override
        public int compare(Account a1, Account a2) {
            return (int) (a1.getBalance() - a2.getBalance());
        }
    };
    public static Comparator<Account> CompareFullName = new Comparator<Account>() {
        @Override
        public int compare(Account a1, Account a2) {
            String fullname1 = a1.getFirstname().toUpperCase() + a1.getLastname().toUpperCase();
            String fullname2 = a2.getFirstname().toUpperCase() + a2.getLastname().toUpperCase();
            return fullname1.compareTo(fullname2);
        }
    };

    @Override
    public String toString() {
        return "Account [firstname=" + firstname + ", lastname=" + lastname + ", balance=" + balance + "]";
    }


    
}
