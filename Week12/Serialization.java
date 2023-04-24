package week12;

import java.io.*;
import java.util.Arrays;

public class Serialization {

    public static void main(String[] args) {

        Person[] persons = {
                new Person("Ulkar", 18),
                new Person("Nijat", 33),
                new Person("Tural", 34)
        };

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persons.bin"))) {
            oos.writeObject(persons);
            System.out.println("Persons saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.bin"))) {

            while (true) {
                try {
                    Person person = (Person) ois.readObject();
                    System.out.println(person);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
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
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
