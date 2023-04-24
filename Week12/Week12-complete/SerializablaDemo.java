import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

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

public class SerializablaDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String filename = "Resources/ex1/persons.dat";
        Person[] persons = new Person[] { new Person(1, "Ali", "Aliyev"), new Person(2, "Muhammed", "Faud"),
                new Person(3, "Samir", "Musayev") };

        writeData(persons, filename);
        readData(filename);
    }

    static void writeData(Person[] persons, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
            for (Person person : persons) {
                oos.writeObject(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(String path) throws ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)))) {
            Object s = null;
            while ((s = ois.readObject()) != null) {
                Person person = (Person) s;
                System.out.println(person.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
