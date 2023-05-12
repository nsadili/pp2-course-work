package Week12;

import java.io.*;
import java.util.Arrays;

public class pw6 {
    
    public static void main(String[] args) {
        Person[] persons = {new Person("John", 25), new Person("Jane", 30), new Person("Bob", 45)};
        String filePath = "Week12/persons.dat";
        savePersons(persons, filePath);
        readPersons(filePath);
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
            Person[] person = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(person));
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
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

