package Week05.PW9;

public class Account {
    private int ID;
    private Costumer costumer;
    private double balance = 0.0;

    public Account(int ID, Costumer costumer, double balance) {
        setBalance(balance);
        setCostumer(costumer);
        setID(ID);

    }

    public Account(int ID, Costumer costumer) {
        this(ID, costumer, 0.0);
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return getCostumerName() + "(" + ID + ")"
                + " balance = $" + getBalance();
    }

    public String getCostumerName() {
        return costumer.getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {

        if (balance >= amount) {
            balance -= amount;

        } else {
            System.out.println("Amount withdrawn exceed the balance");
        }

        return this;
    }
}
