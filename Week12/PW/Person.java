package PW;

import java.io.*;

public class Person implements Serializable {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void savePersons(Person[] persons, String filename) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(persons);
        oos.close();
    }

    public static void readPersons(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Person[] persons = (Person[]) ois.readObject();
        ois.close();

        for (Person person : persons) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Address: " + person.getAddress());
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person[] persons = new Person[2];
        persons[0] = new Person("Alice", 25, "123 Main St.");
        persons[1] = new Person("Bob", 30, "456 Elm St.");

        String filename = "persons.bin";

        savePersons(persons, filename);
        readPersons(filename);
    }
}
