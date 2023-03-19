public class Account implements Comparable<Account> {
    private  String firstName;
    private String lastName;
    private Double balance;

    public Account(String firstName, String lastName, double balance){
        this.firstName=firstName;
        this.lastName=lastName;
        this.balance=balance;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Double getBalance() {
        return balance;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    @Override
    public String toString(){
        return "[Fistname: " + firstName + ", lastname: " + lastName + ", and balance is: " + balance+"]";
    }

    @Override
    public int compareTo(Account o) {
       int compFirstName= firstName.compareTo(o.firstName);
       if(compFirstName!=0) 
       return compFirstName;
       return lastName.compareTo(o.firstName);

    }
    
    
    
}
