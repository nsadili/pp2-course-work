public class Account extends Customer
{
    private int id2;
    private Customer customer;
    private double balance;

    public Account(int id2, Customer customer, double balance)
    {
        this.id2 = id2;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id2, Customer customer)
    {
        // this.id2 = id2;
        // this.customer = customer;   
        // this.balance = 0;     
        this(id2, customer, 0);
    } 

    public int getId2()
    {
        return id2;
    }

    public void setId2(int id2)
    {
        this.id2 = id2;
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
        return "Id2: " + id2 + " " + "Customer: " + customer + " " + "Balance: " + balance;
    }

    public getCustomerName


}