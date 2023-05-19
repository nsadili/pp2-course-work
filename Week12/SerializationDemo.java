import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Nuraddin Sadili", 35),
                new Person("Said Ahadov", 18),
                new Person("Sencer Yeralan", 55)
        };

        String fileName = "persons.bin";

        savePersons(persons, fileName);
        readPersons(fileName);
    }

    public static void savePersons(Person[] persons, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(persons);
            System.out.println("Persons saved to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readPersons(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Person[] persons = (Person[]) ois.readObject();
            for (Person person : persons) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
