package pw;

public class Customer {
    private int ID;
    private String name;
    private char gender;
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Customer [name=" + name + "]";
    }

    
}
