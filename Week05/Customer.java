package Week05;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
            this.name = name;
        }

    public char getGender() {
        return gender;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }


    public String toString() {
        return "Name:" + this.name + ". ID: " + this.id;
    }
}
