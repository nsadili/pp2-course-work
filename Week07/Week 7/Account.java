public class Account {

    private int id;

    private Customer customer;

    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;

    }

    public Account(int id, Customer customer) {
        this(id, customer, 0.0);

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
       if(balance>=0){
        this.balance = balance;
       }
    }

    public String toString() {

        return customer.toString() + " balance: " + String.format("%.2f", this.balance);
    }

    public Account deposit( double amount){

        this.balance+=amount;

        return this;
    }

    public Account withdraw(double amount){

        if(amount>=this.balance){
          throw new InvalidAmountException(String.format("Amount <%.2f> is more than balance <%.2f>", amount, this.balance));
        }
  
        this.balance-=amount;
  
          return this;
  
      }
  
}