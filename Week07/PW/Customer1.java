package Week07.PW;

class Customer1 {
    private String Name;
    private int ID;
    private char gender;

    public Customer1 (String Name , int ID , char gender){
        this.Name = Name;
        this.ID = ID;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return this.Name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setID(int iD) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public String toString() {
        return "Name" + this.getName() + "(" + this.getID() + ")";

    }
    
}
