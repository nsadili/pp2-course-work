package Account;

public class Account 
{
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id2, Customer customer, double balance)
    {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer)
    {    
        this(id, customer, 0);
    } 

    public int getId2()
    {
        return id;
    }

    public void setId2(int id2)
    {
        this.id = id;
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
        return "Id2: " + id + " " + "Customer: " + customer + " " + "Balance: " + balance;
    }

    public String getCustomerName()
    {
        return customer.getName();
    }


    public Account deposit(double amount)
    {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) throws InvalidAmountException 
    {
        if(balance >= amount)
        this.balance -= amount;
        else
         throw new InvalidAmountException();

         return this;
    }
}
