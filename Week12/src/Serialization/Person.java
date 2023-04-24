package Serialization;

public class Person {
    
    private String name;
    private String surname;
    private int id;
    
    
    public Person(String name, String surname, int id) {
        this.name = name;
        this.id = id;
        this.surname = surname;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public String toString() {
        return "Person[id = " + id + ", name = " + name + ", surname = " + surname + "]";
    }
}
