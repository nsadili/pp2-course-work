package Account;
public class Account implements Comparable<Account>{
    private String fName;
    private String lName;
    private Double balance;


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

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account["+fName+","+lName+","+balance+"]\n";
    }

    @Override
    public int compareTo(Account o) {
        int comp = fName.compareTo(o.fName);
        if (comp!=0) return comp;
        return lName.compareTo(o.lName);
    }
    
    
}
