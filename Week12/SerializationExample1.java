package Week12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationExample1 {
    public static void readAndPrintPersons(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            
            Person[] persons = (Person[]) objectInputStream.readObject();
            
            for (Person person : persons) {
                System.out.println(person);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
