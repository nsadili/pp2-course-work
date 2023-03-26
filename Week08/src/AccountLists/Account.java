package AccountLists;

public class Account implements Comparable<Account> {

    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "- $" + balance;
    }

    @Override
    public int compareTo(Account account) {
        return (firstName + " " + lastName).compareTo(account.getFirstName() + " " + account.getLastName());
    }
}