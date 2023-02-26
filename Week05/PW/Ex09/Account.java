package Week05.PW.Ex09;

public class Account
{
    private int ID;
    private Customer customer;
    private double balance;

    public Account(int ID, Customer customer, double balance)
    {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer customer)
    {
        // this.ID = ID;
        // this.customer = customer;   
        // this.balance = 0;     
        this(ID, customer, 0);
    } 

    public int getId2()
    {
        return ID;
    }

    public void setId2(int ID)
    {
        this.ID = ID;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String toString()
    {
        return "ID: " + ID + " " + "Customer: " + customer + " " + "Balance: " + balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }

    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
    
}
