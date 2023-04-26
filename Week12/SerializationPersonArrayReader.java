import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationPersonArrayReader {
    public static void readPersonArray(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            Person[] persons = (Person[]) inputStream.readObject();
            for (Person person : persons) {
                System.out.println(person.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
