package PW;

import java.io.*;

public class SerializablaDemo {
    public static void main(String[] args) {
        File file = new File("/Users/macbook/pp2-course-work/Week12/PW/File.dat");
        Person[] people = new Person[] {new Person(1, "Filankas", "Filankasov"),
                                        new Person(2, "Farid", "Imanov"),
                                        new Person(3, "Murad", "Aghamirzayev")};

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
