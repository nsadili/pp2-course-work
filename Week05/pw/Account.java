package pw;

public class Account extends Customer {
    int id;
    double balance;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account(int ID, String name, char gender, int id, double balance) {
        super(ID, name, gender);
        ID = id;
        this.balance = balance;
    }
    public Account(int ID, String name, char gender, int id) {
        super(ID, name, gender);
        ID = id;
    }
    @Override
    public String toString() {
        return "Account [id=" + id + ", balance=" + balance*1.00 + "]";
    }

    
}
