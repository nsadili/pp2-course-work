import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3 implements Comparable<Ex3> {
        private String firstName;
        private String lastName;
        private double balance;
    
        public Ex3(String firstName, String lastName, double balance) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.balance = balance;
        }

            
        public String toString() {
            return "Account{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    
    
        @Override
        public int compareTo(Ex3 o) {
            if (this.balance < o.balance) {
                return -1;
            } else if (this.balance > o.balance) {
                return 1;
            }
            return 0;
        }

        public static void main(String[] args) {
            List<Ex3> accountList = new ArrayList<>();
            accountList.add(new Ex3("Bradley", "Pitt", 5000.0));
            accountList.add(new Ex3("Ilqar", "Malikov", 3000.0));
            accountList.add(new Ex3("Bill", "Murray", 1000.0));
            Collections.sort(accountList);
            System.out.println(accountList);
        }
    }
    
