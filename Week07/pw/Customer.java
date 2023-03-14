package pw;

public class Customer {
    public int ID;
    public String name;
    public char gen;

    public Customer(int ID, String name, char gen){
        this.ID = ID;
        this.name =name;
        this.gen = gen;
    }

    public Customer(int ID2, String name2, String string) {
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public String toString(){
        return name + "(" +ID+ ")";
    }
}