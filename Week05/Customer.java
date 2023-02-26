public class Customer {
    private int ID;
    private String name;
    private char gender;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
        this.gender = 'm';
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getDiscount() {
        return discount;
    }

    public String toString() {
        return String.format("%s(%d)", name, ID);
    }
}
