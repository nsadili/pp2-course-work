package Week05.PW.Ex09;

public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, int discount){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public char intgetGender(){
        return gender;
    }
    public String toString(){
        return "[" + ID + "," + name + "," + gender +"]";
    }

}
