public class Customer {
    private int ID;
    private String name;
    private char gender;
    private int discount;
    
    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return name + "(" + ID + ")";
    }
    
}
