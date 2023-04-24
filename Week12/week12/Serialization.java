package pp2.week12;
import java.util.*;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Serialization {
    public static class Person implements Serializable {
        private int age;
        private String name;


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

     public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "/Users/bagir/pp2-course-work/Week12.txt";
        Person[] people = {
                new Person("Khavar", 17),
                new Person("Ulker", 17) };

        writeInfo(people, file);
        readInfo(file);
    }

    public static void writeInfo(Person[] people, String file) throws IOException {

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file)))
        {
            output.writeObject(people);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readInfo(String file) throws IOException, ClassNotFoundException {

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
                try {
                    Person person = (Person) input.readObject();
                    System.out.println(person.getName() + ", " + person.getAge());
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

        }
    }
}
