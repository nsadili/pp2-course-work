public class Customer {
        class Customer;{
        private String name;
        private int ID;
        private char gender;
    }
    public Customer(String name, int ID, char gender) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }   
    public char getGender(){
        return gender;
    }
    public String toString() {
        return this.name +"(" + this.ID +")";
    }
}