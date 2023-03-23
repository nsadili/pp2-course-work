package ex;

public class Account implements Comparable<Account> {
    private String firstname;
    private String lastname;
    private Double balance;

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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [firstname=" + firstname + ", lastname=" + lastname + ", balance=" + balance + "]";
    }

    public int compareTo(Account o) {
        int compFirstNames = firstname.compareTo(o.firstname);
        if (compFirstNames != 0)
            return compFirstNames;
        return lastname.compareTo(o.lastname);

    }
}
