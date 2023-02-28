
public class Customer {

    private int ID;
    private String name;
    private char gender;
    private int discount;
    
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