import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Accounts {
    private String fName;
    private String lName;
    private double balance;

    public Accounts(String fName, String lName, double balance){
        this.fName = fName;
        this.lName = lName;
        this.balance = balance;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accounts [fName=" + fName + ", lName=" + lName + ", balance=" + balance + "]";
    }

    static class AccountsComparator implements Comparator<Accounts> {
        public int compare(Accounts acc1, Accounts acc2) {
            if ((acc1.getfName() + " " + acc1.getlName()).compareTo(acc2.getfName() + " " + acc2.getlName()) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Accounts> accs = new ArrayList<>();

        accs.add(new Accounts("Murad", "Mammadov", 1029.55));
        accs.add(new Accounts("Ramazan", "N", 69.69));
        accs.add(new Accounts("Sabir", "Rustamli", 1.69));
        accs.add(new Accounts("Irshad", "Gulmammadov", 200.15));
        accs.add(new Accounts("Aziz", "Atayev", 20.45));

        System.out.println(accs);
        System.out.println();

        Collections.sort(accs, new AccountsComparator());

        System.out.println(accs);
    }
}
