package PW.PW6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SerializablaDemo {
    public static void main(String[] args) {
        File file = new File("/Users/macbook/pp2-course-work/Week12/PW/PW6/File.dat");
        Person[] people = new Person[] {new Person(1, "Ali", "Aliyev"),
                                        new Person(2, "Muhammed", "Faud"),
                                        new Person(3, "Samir", "Musayev")};

        writeData(people, file);
        readData(file);
    }

    static void writeData(Person[] people, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Person[] person = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(person));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }
}
