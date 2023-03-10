class Account {
    private int id;
    private Customer customer;
    private double balance=0.0;

    public Account(int id,Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }
    //getters
    public int getID(){
        return this.id;
    }
    public Customer getCustomer(){
        return this.customer;
    }
    public double getBalance(){
        return this.balance;
    }
    //setter
    public void setBalance(double a){
        this.balance=a;
    }
    //tostring 
    public String toString(){
        return String.format("%s balance=$%.2f", customer.toString(), getBalance());
    }
    //get customer name
    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        this.balance+=amount;
        return this;
    }
    public Account withdraw(double amount){
        if (this.balance<amount){
            throw new InvalidAmountException("Amount withdrawn exceeds the current balance!");
        }
        this.balance-=amount;
        return this;
    }
}
