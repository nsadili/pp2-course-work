import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    public static void main(String[] args) {
        String path = "Resources/ex1/persons.dat";
        Person[] persons = new Person[] { new Person(1, "Ali", "Aliyev"), new Person(2, "Muhammed", "Faud"),
                new Person(3, "Samir", "Musayev") };

        writeData(persons, path);
        readData(path);
    }

    static void writeData(Person[] persons, String path) {
        try (FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(persons);  
                System.out.println("Data serialized successfully!"); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(String path) {
        try (FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis)){
            Person[] personsNew = (Person[]) ois.readObject();
            // System.out.println(ois.readObject());
            for (Person p: personsNew){
                System.out.println(p.fname+" "+p.lname+" "+p.id);
            }
            System.out.println("Data read successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
         

    }

}
