package week08;
import java.util.ArrayList;
import java.util.List;

    public class Account {

        public class Main {
            public static void main(String[] args) {
                List<Account> accounts = new ArrayList<>();

                accounts.add(new Account("Ulkar", "Ahmadli", 1000.0));
                accounts.add(new Account("Nijat", "Ahmadli", 5000.0));
                accounts.add(new Account("Rovshan", "Ahmadli", 2000.0));

                for (Account account : accounts) {
                    System.out.println(account);
                }
            }
        }

        private String firstname;
        private String lastname;
        private double balance;

        public Account(String firstname, String lastname, double balance) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.balance = balance;
        }

        public String toString() {
            return "Account{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", balance=" + balance +
                    '}';
        }

    }
