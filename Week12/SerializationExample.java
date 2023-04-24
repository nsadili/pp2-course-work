package exceptions;

import java.io.*;

public class SerializationExample {
    public static void savePeople(Person[] people, String filename) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(people);
            out.close();
            System.out.println("Saved people to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readPeople(String filename) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            while (true) {
                try {
                    Person person = (Person) in.readObject();
                    System.out.println(person);
                } catch (ClassNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("Finished reading from file.");
        }
    }
}
