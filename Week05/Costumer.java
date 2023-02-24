public class Costumer {
    private int ID;
    private String name;
    private char gender;
    private int discount;

    public Costumer(int ID, String name, char gender, int discount) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
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

    public int getDiscount() {
        return discount;
    }
    
    public String toString(){
        return name + " " + String.valueOf(ID);
    }
}
