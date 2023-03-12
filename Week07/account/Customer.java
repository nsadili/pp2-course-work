package account;
import account.*;

public class Customer {
    private int ID;
    private String name;
    private char gender;
    private int discount;

    public Customer(int id,String name,char gen,int disc) {
        this.ID=id;
        this.name=name;
        this.discount=disc;
        this.gender=gen;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public int getDiscount() {
        return this.discount;
    }

    public String toString() {
        return this.getName()+"("+this.getID()+")";
    }
    }


