
class Customer {
    private int id;
    private String name;
    private char gender; // 'm' or 'f'

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", name, id);
    }
}

class Account {

}

public class Main5 {
    public static void main(String[] args) {
        // Customer customer1 = new Customer(1, "Jonathan", 'm');
        // Customer customer2 = new Customer(2, "Merry", 'f');

        // System.out.println(customer1);
        // System.out.println(customer2);

        // Account acc1 = new Account(1001, customer1);
        // Account acc2 = new Account(1025, customer2, 35.53);

        // System.out.println(acc1);
        // System.out.println(acc2);

        // acc2.deposit(100).withdraw(150);

        // System.out.println(acc2);

    }
}
