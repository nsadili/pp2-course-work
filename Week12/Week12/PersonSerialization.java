package Week12;

import java.io.*;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class PersonSerialization {
    public static void savePersons(Person[] persons, String fileName) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStream.writeObject(persons);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readPersons(String fileName) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            Person[] persons = (Person[]) inputStream.readObject();
            inputStream.close();

            for (Person person : persons) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Lala Azimova", 30);
        persons[1] = new Person("Gul Huseynova", 25);
        persons[2] = new Person("Ayla Bashirova", 40);

        savePersons(persons, "persons.dat");
        readPersons("persons.dat");
    }
}

