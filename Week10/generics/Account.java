package generics;

public class Account implements Comparable<Account> {
    String firstname;
    String lastname;
    Double balance;

    public Account(String firstname, String lastname, Double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [firstname=" + firstname + ", lastname=" + lastname + ", balance=" + balance + "]";
    }

    public int compareTo(Account o) {
        int difference = firstname.compareTo(o.firstname);

        return difference != 0 ? difference : lastname.compareTo(o.lastname);
    }
}