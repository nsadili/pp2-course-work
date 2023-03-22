public class Account implements Comparable<Account>{
    private String firstName;
    private String lastName;
    private Double balance;

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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [Name=" + firstName + ", LastName=" + lastName + ", balance=" + balance + "]";
    }

    @Override
    public int compareTo(Account o) {
        int comFirstName = firstName.compareTo(o.firstName);
        if (comFirstName != 0)
            return comFirstName;

        return lastName.compareTo(o.lastName);
    }


}
