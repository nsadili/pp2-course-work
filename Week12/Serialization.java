package Week12;

import java.io.*;

class Person2 implements Serializable {
    private String name;
    private int age;

    public Person2(String name, int age) {
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
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class Serialization {
    public static void saveToFile(Person2[] persons, String fileName) {
        File file = new File("Week12/Files/" + fileName);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Week12/Files/" + fileName))) {
            oos.writeObject(persons);
            System.out.println("Persons saved to file: " + file.getAbsolutePath());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName) {
        File file = new File("Week12/Files/" + fileName);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Week12/Files/" + fileName))) {
            Person2[] persons = (Person2[]) ois.readObject();
            System.out.println("Persons read from file: " + file.getAbsolutePath());
            for (Person2 person : persons) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person2[] persons = {
                new Person2("Eljan", 20),
                new Person2("Natiq", 21),
                new Person2("Xeyyam", 13)
        };

        String fileName = "persons.txt";

        saveToFile(persons, fileName);
        readFromFile(fileName);
    }
}
