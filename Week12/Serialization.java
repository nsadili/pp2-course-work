package Week12;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization{
    public static void main(String[] args) {
        String filename = "Resources/ex1/persons.dat";
        Person[] persons = new Person[] { new Person(1, "Murad", "Tahmazli"), new Person(2, "Kamran", "Tahmazli"),
                new Person(3, "Orxan", "Agayev") };

        writeData(persons, filename);
        readData(filename);
    }

    static void writeData(Person[] persons, String path) {
        File file = new File(path);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for(Person p: persons){
                oos.writeObject(p);  

            }
            oos.writeObject(new EndOfFileIndicatorObject());
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    static void readData(String path) {
        File file = new File(path);
        Object o;
        Person p;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            o = ois.readObject();

            while(!(o instanceof EndOfFileIndicatorObject)){
                p = (Person) o;
                System.out.println(p);
                o = ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
class EndOfFileIndicatorObject implements Serializable{
}
class Person implements Serializable{
    int id;
    String fname;
    String lname;

    public Person(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String toString() {
        return "Person[id = " + id + ", fname = " + fname + ", lname = " + lname + "]";
    }
}