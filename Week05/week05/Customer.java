package pp2.week05;
import java.util.*;
public class Customer {
    private int ID;
    private String name;
    char gender;

    public Customer(int ID, String name, char gender) {
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


    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }
}
