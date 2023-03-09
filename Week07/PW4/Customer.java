package PW4;

public class Customer {
    private int ID;
    private String name;
    private char gender;
    public Customer(){}
    public Customer(int ID, String name, char gender){
        setGender(gender);
        setID(ID);
        setName(name);
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
    public void setID(int iD) {
        ID = iD;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString(){
        return String.format("\nCustomer name (%d): %s\n", this.ID, this.name);
    }
    
}