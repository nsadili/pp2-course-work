public class Account implements Comparable<Account> {
    private String firstName;
    private String lastName;
    private Double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.balance=balance;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "firtName is " + firstName + " lastName is " + lastName + " balance is " + balance;
    }

    @Override
    public int compareTo(Account o) {
        int compFirstName = firstName.compareTo(o.firstName);
        if(compFirstName != 0) return compFirstName;
        return lastName.compareTo(o.lastName);
    }
}
