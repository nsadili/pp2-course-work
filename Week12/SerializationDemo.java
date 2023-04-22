package Ex6;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person[] persons = { new Person("Alice", 25), new Person("Bob", 30) };
        String filename = "/Users/raqli/Desktop/pp2-course-work/Week12/Ex6/person.txt";
        savePersons(persons, filename);
        readPersons(filename);
    }

    public static void savePersons(Person[] persons, String filename) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(persons);
        }
    }

    public static void readPersons(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                try {
                    Person person = (Person) inputStream.readObject();
                    System.out.println(person.getName() + " " + person.getAge());
                } catch (EOFException e) {
                    break;
                }
            }
        }
    }

    public static class Person implements Serializable {
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
    }
}
