package pp2.week12;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static class Person implements Serializable {
        private int Age;
        private String Name;


        public Person(String name, int age) {
            this.Age = age;
            this.Name = name;
        }

        public String getName() {
            return Name;
        }

        public int getAge() {
            return Age;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "C:/Users/Lenovo/Desktop/pp2-course-work/Week12.txt";
        Person[] people = {
                new Person("Ayla", 18),
                new Person("Kubra", 17) };

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
