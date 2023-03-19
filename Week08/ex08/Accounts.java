import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Accounts {

    private String fName;
    private String lName;
    private double balance;

    public Accounts(String fName, String lName, double balance) {
        this.fName = fName;
        this.lName = lName;
        this.balance = balance;
    }

    public String getlName() {
        return lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Accounts [fName=" + fName + ",   lName=" + lName + ", balance=" + balance + "]\n";
    } 
        
}

class AccountsComparator implements Comparator <Accounts> {

    public int compare(Accounts acc1, Accounts acc2)
    {
        if ((acc1.getfName() + " " + acc1.getlName()).compareTo((acc2.getfName() + acc2.getlName())) > 0){
            return 1;
        }
        return -1;
    }
}



class AccountsBalanceComparator implements Comparator <Accounts> {

    public int compare(Accounts acc1, Accounts acc2)
    {
        if (acc1.getBalance() == acc2.getBalance())
            return acc1.getfName().compareTo(acc2.getfName());
            
        if (acc1.getBalance() > acc2.getBalance()){
            return 1;
        }
        return -1;
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList <Accounts> accnts = new ArrayList<>();

        accnts.add(new Accounts("Tofig", "Abishov", 1029.38));
        accnts.add(new Accounts("Ahmad", "Abishov", 1029.38));
        accnts.add(new Accounts("Random1", "Abishov", 3223.38));
        accnts.add(new Accounts("Amin", "Abishov", 645));
        accnts.add(new Accounts("Alim", "Abishov", 1029));
        accnts.add(new Accounts("Ali", "Abishov", 102349));
        accnts.add(new Accounts("Rza", "Abishov", 102028));
        
        System.out.println(accnts);

        Collections.sort(accnts, new AccountsComparator());

        System.out.println(accnts);

        Collections.sort(accnts, new AccountsBalanceComparator());

        System.out.println(accnts);
    }
}