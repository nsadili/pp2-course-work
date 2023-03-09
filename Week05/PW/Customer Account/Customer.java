import java.util.Scanner;

public class Customer {

    private int ID;
    private String name;
    private char gender;

    
    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
       
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return String.format("%s(%d)",this.name,this.ID);
    }
}






