package Week05.geometry;

public class Costumer {
     static int ID;
     static String name = new String("name");
    char[] gender = {'m' ,'f'};
    int discount;
    public Costumer(int ID, String name, int discount){
        this.ID = ID;
        this.name = name;
        this.discount = discount;
        }
        public int getID(){
            return ID;
    }
    public String getName(){
        return name;
    }
    public char[] getGender(){
        return gender;
    }
    public static void main(String[]args){
        String nameID = name + "()" + ID + ")";
    }
    }

