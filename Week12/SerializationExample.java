import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 25),
                new Person("Jane", 30),
                new Person("Bob", 40)
        };

        String filename = "persons.dat";

        // save the persons array in a binary file
        savePersonsToFile(persons, filename);

        // read all persons from the file and print their info
        readPersonsFromFile(filename);
    }

    /**
     * Save an array of persons to a binary file using ObjectOutputStream
     *
     * @param persons  The array of persons to save
     * @param filename The name of the file to save to
     */
    public static void savePersonsToFile(Person[] persons, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(persons);
            System.out.println("Persons saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error saving persons to file: " + e.getMessage());
        }
    }

    /**
     * Read all persons from a binary file using ObjectInputStream and print their info
     *
     * @param filename The name of the file to read from
     */
    public static void readPersonsFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person[] persons = (Person[]) ois.readObject();
            System.out.println("Persons read from file: " + filename);
            for (Person person : persons) {
                System.out.println(person.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading persons from file: " + e.getMessage());
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (age " + age + ")";
    }
}

// The SerializationExample class defines two methods: savePersonsToFile and readPersonsFromFile. 
// The savePersonsToFile method takes an array of Person objects and a filename as arguments, 
// and saves the array to a binary file using ObjectOutputStream. 
// The readPersonsFromFile method takes a filename as an argument, reads the Person objects from the file
// using ObjectInputStream, and prints their information to the console.

// The Person class implements the Serializable interface, 
// which allows instances of the class to be serialized and deserialized. 
// It has two instance variables, name and age, and a constructor and getter methods for each.

// When reading the Person objects from the file using ObjectInputStream, 
// the EOFException is thrown when the end of the file is reached. 
// To ensure that all Person objects are read, we can catch this exception and handle it appropriately, 
// for example by breaking out of a loop or setting a flag to indicate that all objects have been read.
