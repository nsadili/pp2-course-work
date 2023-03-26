public class Accoun {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Accoun(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Accoun(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Accoun(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.getName() + "(" + getId() + ") balance=$" + getBalance();
    }

    public Accoun deposit(double amount) {
        return new Accoun(this.id, this.customer, this.balance + amount);
    }


    public Accoun withdraw(double amount) throws InvalidAmountException {
        if (this.balance >= amount)
            return new Accoun(this.id, this.customer, this.balance - amount);
        else
            throw new InvalidAmountException("should not be more than the balance");
    }
}