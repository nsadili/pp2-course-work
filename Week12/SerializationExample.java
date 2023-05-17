package Week12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void savePersons(Person[] persons, String filePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            
            objectOutputStream.writeObject(persons);
            System.out.println("Persons saved successfully.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
