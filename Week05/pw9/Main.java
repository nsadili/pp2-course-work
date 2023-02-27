package Week05.pw9;

public class Main {
        public static void main(String[] args) {
            Customer customer1 = new Customer(17256, "Leyla Neymat", 'f');
            Customer customer2 = new Customer(17606, "Elvin Hayatov", 'm');
            Account account1 = new Account(customer1.getID(), customer1, 100.3);
            Account account2 = new Account(customer2.getID(), customer2, 210.4);
            System.out.print(account1.toString() + '\n');
            System.out.print(account2.toString() + '\n');
            System.out.print(account1.getCustomerName() + '\n');
            System.out.print(account2.deposit(14).toString() + '\n');
            System.out.println(account1.withdraw(200));
            System.out.println(account2.withdraw(100).toString() + '\n');
        } 
    }
