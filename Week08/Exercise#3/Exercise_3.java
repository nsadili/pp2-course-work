import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_3 implements Comparable<Exercise_3> {
    private String firstName;
    private String lastName;
    private double balance;

    public Exercise_3(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public int compareTo(Exercise_3 o) {
        if (this.balance < o.balance) {
            return -1;
        } else if (this.balance > o.balance) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        List<Exercise_3> accountList = new ArrayList<>();
        accountList.add(new Exercise_3("Ramil", "Khaspoladov", 4677.0));
        accountList.add(new Exercise_3("Masha", "Andreyevna", 5999.0));
        accountList.add(new Exercise_3("Oleg", "Poladov", 400.0));
        Collections.sort(accountList);
        System.out.println(accountList);
    }
}
