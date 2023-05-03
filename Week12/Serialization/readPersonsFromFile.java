import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.EOFException;

public static void readPersonsFromFile(String filename) {
    try {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);

        while (true) {
            try {
                Person person = (Person) ois.readObject();
                person.printInfo();
            } catch (EOFException e) {
                break;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        ois.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
