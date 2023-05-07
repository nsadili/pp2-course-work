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

    public Person(int parseInt, String string, String string2, int parseInt2) {
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
        String filename = "Resources/ex1/persons.txt";
        Person[] persons = new Person[] { 
        new Person(1, "Ali", "Aliyev"), 
        new Person(2, "Muhammed", "Faud"),
        new Person(3, "Samir", "Musayev") };

         writeData(persons, filename);
         readData(filename);
    }

   
    static void writeData(Person[] persons, String path) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(persons);
                
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            
               
                Person[] persons = (Person[]) ois.readObject();
                for(Person person : persons){
                System.out.println(person);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
