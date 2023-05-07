import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EndOfFileIndicatorObject implements Serializable {

}

class Person implements Serializable {
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

public class Serialization {
    public static void main(String[] args) {
        String filename = "Week12/resources/persons.dat";
        Person[] persons = new Person[] { new Person(1, "Jason", "Statham"), new Person(2, "Ouven", "Shrider"),
                new Person(3, "Samir", "Musayev") };

        readData(filename);
    }

    static void writeData(Person[] persons, String path) {
        File file = new File(path);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Person p : persons)
                oos.writeObject(p);

            oos.writeObject(new EndOfFileIndicatorObject());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(String path) {
        File file = new File(path);
        Object obj;
        Person p;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            obj = ois.readObject();
            while (!(obj instanceof EndOfFileIndicatorObject)) {
                p = (Person) obj;
                System.out.println(p);
                obj = ois.readObject();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}