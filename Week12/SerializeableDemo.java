import java.io.*;
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

public class SerializeableDemo {
    public static void main(String[] args) {
        String filename = "Week12/Resources/ex1/persons.dat";
        Person[] persons = new Person[] { new Person(1, "Ali", "Aliyev"), new Person(2, "Muhammed", "Faud"),
                new Person(3, "Samir", "Musayev") };

        // writeData(persons, filename);
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
        Object object;
        Person p;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            object = ois.readObject();
            while (!(object instanceof EndOfFileIndicatorObject)) {
                p = (Person) object;
                System.out.println(p);
                object = ois.readObject();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}