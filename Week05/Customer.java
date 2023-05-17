package Week05;

public class Customer {
    private int ID;
    private String Name;
    private char Gender;

    public Customer(int ID, String Name, char Gender){
        setGender(Gender);
        setID(ID);
        setName(Name);

    }
    
    public void setID(int iD) {
        ID = iD;
    }


    public void setName(String name) {
        Name = name;
    }


    public void setGender(char gender) {
        Gender = gender;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public char getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

    }


    
    

}
