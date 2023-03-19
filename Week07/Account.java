public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

 
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
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

    public String toString() {
        return customer.toString() + "balance = $" + getBalance();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {

        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) throws InvalidAmountException {
        if (balance >= amount)
            this.balance -= amount;
        else
            throw new InvalidAmountException();

        return this;
    }

        public static void main(String[] args) {
            Customer c = new Customer(1, "Vasila", 4);
    
            Account a = new Account(16144, c, 3000);
    
            System.out.println("Balance: " + a.toString());
    
            a.deposit(300.0);
    
            System.out.println("After deposit: " + a.getBalance());
    
            try {
                a.withdraw(50.0);
            } catch (InvalidAmountException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Balance after withdraw: " + a.getBalance());
            }
        }
    
        
    }
