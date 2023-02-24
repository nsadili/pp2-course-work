package pw.Customer;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender, double discount){
        if (gender!= 'm'&& gender!='f') {
            System.out.println("Please, provide a valid gender type (m or f).");
            System.exit(1);
        }
        this.id=id;
        this.name=name;
        this.gender=gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){            
        return getName()+"("+this.id+")";
    }
}
