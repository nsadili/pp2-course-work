package Serialization;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationTest {

    // Method to save an array of persons in a binary file using ObjectOutputStream
    public static void savePersons(Person[] persons, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persons);
            oos.close();
            fos.close();
            System.out.println("Persons saved to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read all the persons from a binary file and print their info using ObjectInputStream
    public static void readPersons(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person[] persons = (Person[]) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Persons read from file: " + fileName);
            for (Person p : persons) {
                System.out.println(p);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example array of persons
        Person[] persons = new Person[] { new Person("John", "Doe", 25), new Person("Jane", "Smith", 30), new Person("Bob", "Jones", 40)
        };

        // Save persons to file
        savePersons(persons, "persons.dat");

        // Read persons from file and print their info
        readPersons("persons.dat");
    }
}
