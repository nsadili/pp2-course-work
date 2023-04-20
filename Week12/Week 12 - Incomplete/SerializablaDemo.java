import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

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
    public static void main(String[] args) {
        String filename = "Resources/ex1/persons.dat";
        Person[] persons = new Person[] { new Person(1, "Ali", "Aliyev"), new Person(2, "Muhammed", "Faud"),
                new Person(3, "Samir", "Musayev"), new Person(4, "Shamil", "Abbasov") };

        writeData(persons, filename);
        var personArr = readData(filename);
       for(var x: personArr) System.out.println(x);

    }

    static void writeData(Person[] persons, String path) {
        try (
                FileOutputStream fis = new FileOutputStream(path);
                ObjectOutputStream ous = new ObjectOutputStream(fis)) {

            for (var i : persons) {
                ous.writeObject(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static Person[] readData(String path) {
        List<Person> persons = new LinkedList<>();
        try (FileInputStream fis = new FileInputStream(path);
                ObjectInputStream os = new ObjectInputStream(fis)) {
            Object readed = null;

            while (os.available() >= 0) {
                // System.out.println("Burdayam");
                readed = os.readObject();
                persons.add((Person) readed);
                System.out.println(readed);
            }
        }

        catch (EOFException e) {
            // System.out.println(e.getClass().getName() );
            // System.out.println(e.getCause());
            System.out.println("End OF File! EOF exception catched");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        
        return persons.toArray(new Person[persons.size()]);
    }

}