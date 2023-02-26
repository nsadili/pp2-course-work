class Account {
    private int id;
    private Customer customer;
    private double balance=0.0;

    public Account(int id, Customer customer, double balance) {
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer customer) {
        this.id=id;
        this.customer=customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setID(int id) {
        this.id=id;
    }

    public void setCustomer(Customer customer) {
        this.customer=customer;
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }

    public String toString() {
        return customer.toString() + " balance=" + this.balance;
    }

    public String getCustomerName() {
        return getCustomer().getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if(balance>=amount) {
            balance-=amount;
            return this;
        }
            
        else return null;
        //System.out.println("amount withdrawn exceeds the current balance! ");
        
    }
    
    
}
