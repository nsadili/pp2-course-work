package ex3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // b
        List<Accounts> accs = new LinkedList<Accounts>();
        accs.add(new Accounts("Ali", "Garagashli", 700));
        accs.add(new Accounts("Mirmammad", "Huseynli", 4000));
        accs.add(new Accounts("Ashraf", "Gulu", 2000));
        accs.add(new Accounts("Balakishi", "Alisoy", 1000));

        // c
        System.out.println(accs.toString() + "\n");

        // d
        Comparator<Accounts> compFirstName = new Comparator<Accounts>() {
            public int compare(Accounts a, Accounts b) {
                return a.getFirstname().compareTo(b.getFirstname());
            }
        };
        accs.sort(compFirstName);
        System.out.println(accs.toString() + "\n");

        Comparator<Accounts> compBalance = new Comparator<Accounts>() {
            public int compare(Accounts a, Accounts b) {
                return Double.compare(a.getBalance(), b.getBalance());
            }
        };
        accs.sort(compBalance);
        System.out.println(accs.toString() + "\n");
    }
}
