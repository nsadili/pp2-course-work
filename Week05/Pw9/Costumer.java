package Week05.Pw9;

public class Costumer {
    private int ID;
    private String name;
    private char gender;

    public Costumer (int ID, String name, int discount){
        this.name = name;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
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

    public String toString(Costumer c){
        return getName() + "(" + ID + ")";

    } 
}
