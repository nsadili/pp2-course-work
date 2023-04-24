package Week07.pw4;

public class Customer {
    int ID;
    String name;
    String gender;
    public Customer(int iD, String name, String string) {
        ID = iD;
        this.name = name;
        this.gender = string;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Customer [ID=" + ID + ", name=" + name + ", gender=" + gender + "]";
    }
    
}
