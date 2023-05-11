package ex6;

import java.io.*;

public class SerializationOne {
    public static void savePersons(Person[] persons, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

