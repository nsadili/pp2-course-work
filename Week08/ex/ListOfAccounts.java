public class ListOfAccounts implements Comparable<ListOfAccounts>{
    private String firstName;
    private String lastName;
    private double balance;

    public ListOfAccounts(String firstName, String lastName, double balance) {
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
        return firstName + " " + lastName + " (" + balance + ")";
      }

      public int compareTo(ListOfAccounts o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }

}
