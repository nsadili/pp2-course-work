import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public static void savePersonsToFile(Person[] persons, String filename) {
    try {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Person person : persons) {
            oos.writeObject(person);
        }
        oos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
