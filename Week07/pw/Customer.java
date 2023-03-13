package pw;

public class Customer {
    public int ID;
    public String name;
    public char gender;

    public Customer(int ID, String name, char gender){
        this.ID = ID;
        this.name =name;
        this.gender = gender;
    }

    public Customer(int iD2, String name2, String string) {
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

    public String toString(){
        return name + "(" +ID+ ")";
    }
}