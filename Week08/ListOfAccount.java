package Week08;

public class ListOfAccount {
    public String firstname;
    public String lastname;
    public double balance;


    public ListOfAccount(String firstname, String lastname, double balance){
        this.firstname = firstname;
        this.lastname = lastname;
        
    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }
 
}
