package week08;
import java.util.*;
public class ListOfAccounts {

        public static void main(String[] args) {
            class Account implements Comparable<Account> {
                private String firstName;
                private String lastName;
                private double balance;

                public Account(String firstName, String lastName, double balance) {
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.balance = balance;
                }

                @Override
                public String toString() {
                    return "Account{" +
                            "firstName='" + firstName + '\'' +
                            ", lastName='" + lastName + '\'' +
                            ", balance=" + balance +
                            '}';
                }


                @Override
                public int compareTo(Account o) {
                    String fullName1 = this.firstName + " " + this.lastName;
                    String fullName2 = o.firstName + " " + o.lastName;
                    return fullName1.compareTo(fullName2);
                }
            }


            List<Account> accountList = new ArrayList<>();
            accountList.add(new Account("Ulkar", "Ahmadli", 1000));
            accountList.add(new Account("Nijat", "Ahmadli", 2000));
            accountList.add(new Account("Rovshan", "Ahmadli", 1500));


            System.out.println("Original list:");
            for (Account account : accountList) {
                System.out.println(account);
            }


            Collections.sort(accountList);
            System.out.println("Sorted based on fullname:");
            for (Account account : accountList) {
                System.out.println(account);
            }


            Comparator<Account> comparator = new Comparator<Account>() {
                @Override
                public int compare(Account o1, Account o2) {
                    return Double.compare(o1.balance, o2.balance);
                }
            };
            accountList.sort(comparator);
            System.out.println("Sorted based on balance:");
            for (Account account : accountList) {
                System.out.println(account);
            }
        }
    }