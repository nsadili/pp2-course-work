package Week08;

public class Account implements Comparable<Account> {
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public int compareTo(Account o) {
        int cmp = (this.getFirstName() + this.getLastName()).compareTo(o.getFirstName() + o.getLastName());

        if(cmp == 0){
            cmp = Double.compare(this.getBalance(), o.getBalance());
        }
        return cmp;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public String toString(){
        return "Account{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' + 
                ", balance = " + balance+
                '}';
    } 
}

