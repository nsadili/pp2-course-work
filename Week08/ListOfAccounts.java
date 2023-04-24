package Week08;

import java.util.*;

public class ListOfAccounts {
    public static void main(String[] args) {
        List<Account> acc = new ArrayList<>();
        
        acc.add(new Account("Said", "Ahadov", 174));
        acc.add(new Account("Emin", "Aliyev", 10));
        acc.add(new Account("Ali", "Dadayev", 1000));
        
        Collections.sort(acc);
        System.out.println("Sorted by fullname using Comparable:");
        for (Account account : acc) {
            System.out.println(account);
        }
        
        Collections.sort(acc, new BalanceComparator());
        System.out.println("\nSorted by balance using Comparator:");
        for (Account account : acc) {
            System.out.println(account);
        }
    }
    
    public static class Account implements Comparable<Account> {
        private String firstname;
        private String lastname;
        private double balance;
        
        public Account(String firstname, String lastname, double balance) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.balance = balance;
        }
        
        @Override
        public String toString() {
            return "Account [firstname=" + firstname + ", lastname=" + lastname + ", balance=" + balance + "]";
        }
        
        public String getFullname() {
            return firstname + " " + lastname;
        }

        @Override
        public int compareTo(Account other) {
            return this.getFullname().compareTo(other.getFullname());
        }
    }
    
    public static class BalanceComparator implements Comparator<Account> {
        @Override
        public int compare(Account a1, Account a2) {
            return Double.compare(a1.balance, a2.balance);
        }
    }
}