package Week05;

public class Customer {
    private int ID, discount;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender, int discount) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }

    public char getGender() {
        return gender;
    }

    public int getID() {
        return ID;
    }

    public int getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + "(" + this.ID + ")";
    }
}
