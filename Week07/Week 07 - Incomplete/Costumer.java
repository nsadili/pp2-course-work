package Week07;

public class Costumer {
    private static  int ID;
    private String name;
    private int discount;
    private char[] gender = {'m', 'f'};
    public Costumer(int ID, String name, int discount){
        this.ID = ID;
        this.name = name;
        this.discount = discount ;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    
    public static void setID(int iD) {
        ID = iD;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public void setGender(char[] gender) {
        this.gender = gender;
    }
    public char[] getGender() {
        return gender;
    }
    public  static void toStirng( String name){
    
        String nameID = name + "(" + ID + ")";
    }
    

}
