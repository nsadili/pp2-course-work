public class Account {
    private int id;
    private Costumer costumer;
    private double balance;

    public Account(int id, Costumer costumer, double balance){
        this.id = id;
        this.costumer = costumer;
        this.balance = balance;
    }

    public Account(int id, Costumer costumer){
        this.id = id;
        this.costumer = costumer;
    }

    public int getID(){
        return id;
    }

    public Costumer getCostumer(){
        return costumer;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){
        return costumer.toString() + " " + "balance=" + balance;
    }

    public String getCostumerName(){
        return costumer.getName();
    }

    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }else{
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
