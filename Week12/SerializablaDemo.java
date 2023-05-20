package Week12;

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
        String filename = "Resources/ex1/persons.dat";
        Person[] persons = new Person[] { new Person(1, "Ali", "Aliyev"), new Person(2, "Muhammed", "Faud"),
                new Person(3, "Leyla", "Huseynova") };

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
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
            Object object;
            while ((object = inputStream.readObject()) != null) {
               if (object instanceof Person) {
                  Person person = (Person) object;
                  System.out.println(person);
               }
            }
            inputStream.close();
         } catch (IOException e) {
            System.out.println("An error occurred while reading persons from file.");
            e.printStackTrace();
         } catch (ClassNotFoundException e) {
            System.out.println("An error occurred while casting object to Person class.");
            e.printStackTrace();
         }
        return null;

}
}