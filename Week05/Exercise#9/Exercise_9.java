public class Customer{
    public int ID(int x);
    public String name; 
    public char gender; 

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name; 
        this.gender = gender; 
    }

    public int getID() {
        return ID;
    }

    public String getname() {
        return name;
    }

    public char getgender() {
        return gender; 
    }

    public String toString() {
        return this.name + "(" + this.ID + ")";
             
    }
}