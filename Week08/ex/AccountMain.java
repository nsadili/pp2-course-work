import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;

public class AccountMain {

    public static void main(String[] args) {
        Account a1 = new Account("Rufat", "Hajizada", 3000);
        Account a2 = new Account("Shamil", "Abbasov", 200);
        Account a3 = new Account("Arzum", "Abdullazada", 1400);
        Account a4 = new Account("Nariman", "Mammadov", 1500);
        
        ArrayList<Account> accs = new ArrayList<>();
        Collections.addAll(accs, a1, a2, a3, a4);
        System.out.println(accs);
        // Collections.sort;
    }
}

// class AccountsbalanceComparator implements Comparator <Account>{
//     public int compare (Account a1, Account a2){
//         if (a1.)
//     }
// }

class Account {
    private String fName;
    private String lName;
    private double balance;


    public Account(String fName, String lName, double balance) {
        this.fName = fName;
        this.lName = lName;
        this.balance = balance;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account["+fName+","+lName+","+balance+"]\n";
    }
    
}

