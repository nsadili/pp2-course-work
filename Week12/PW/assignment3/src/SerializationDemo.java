import java.io.*;

public class SerializationDemo {

    static class Person implements Serializable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void savePersons(Person[] persons, String filePath) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(persons);
            oos.close();
            System.out.println("Persons saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printPersons(String filePath) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            Person[] persons = (Person[]) ois.readObject();
            ois.close();
            System.out.println("Persons in " + filePath + ":");
            for (Person person : persons) {
                System.out.println(person);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person[] persons = { new Person("Ali", 15), new Person("Jamal", 25), new Person("Teymur", 35) };
        String filePath = "persons.bin";

        savePersons(persons, filePath);
        printPersons(filePath);
    }
}
