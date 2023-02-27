public class Account {
    public int id;
    public Customer customer;
    public double balance;

    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id,Customer customer){
        this(id,customer,0.0);
    }

    public Account deposit(double amount){
        balance += amount;
        return this;
    }

    public String toString() {
        return customer.toString() + String.format("%.2f", balance);
    }

    public Account withdraw(double amount){
        if(balance >= amount){
            amount -= balance;
        } else {
            System.out.println("amount withdrawn exseeds the current balance!");
        }
        return this;
    }
















    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }    
}
