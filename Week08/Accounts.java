import java.util.ArrayList;
import java.util.Comparator;

public class Accounts {
    private String  fName;
    private String lName;
    private double balance;
    public Accounts(String fName, String lName, double balance) {
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
    
    
}
class AccountComparator implements Comparator <Accounts>{
    public int compare(Accounts acc1, Accounts acc2){
        if((acc1.getfName()+ " "+acc1.getlName()) compareTo(acc2.getfName(), acc2.getlName())){
            return 1;
        }
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Accounts> accnts=new ArrayList<>();
        accnts.add(new Accounts("Vusat", "Ahmadzada", 321.32));
        System.out.println(accnts);

    }
}
