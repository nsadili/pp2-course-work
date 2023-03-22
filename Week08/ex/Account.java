public class Account implements Comparable<Account>{

    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName,String lastName, double balance){
        this.firstName=firstName;
        this.lastName=lastName;
        this.balance=balance;
    }
    //getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getBalance(){
        return this.balance;
    }
    //setter
    public void setBalance(double a){
        this.balance=a;
    }
    
    public Account deposit(double amount){
        this.balance+=amount;
        return this;
    }
    public Account withdraw(double amount){
        // if (this.balance<amount){
        //     throw new InvalidAmountException("Amount withdrawn exceeds the current balance!");
        // }
        this.balance-=amount;
        return this;
    }
    @Override
    public String toString() {
        return String.format("Account| First Name: %s, Last Name: %s, Balance: %.3f\n", getFirstName(), getLastName(), getBalance());
    }

    @Override
    public int compareTo(Account o) {
        
        int compFirstName = firstName.compareTo(o.firstName);
        
        if(compFirstName !=0){
            return compFirstName;
        } return lastName.compareTo(o.lastName);
    }
}
