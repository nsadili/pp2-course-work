package Week08;

public class Account {
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

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Balance: $%.2f", firstName, lastName, balance);
    }
}

