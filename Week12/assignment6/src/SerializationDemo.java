import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return "\nName: " + name + ", Age: " + age + ", Address: " + address;
    }
}

public class SerializationDemo {

    public static void main(String[] args) {

        Person[] persons = { new Person("Samir", 27, "Qazax"),
                new Person("Azer", 32, "Baku"),
                new Person("Babak", 39, "Sheki\n") };

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testfile.info"));
            oos.writeObject(persons);
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testfile.info"));
            Person[] personsFromFile = (Person[]) ois.readObject();
            ois.close();

            for (Person person : personsFromFile) {
                System.out.println(person);
            }
        } catch (EOFException ex) {
            System.out.println("End of file reached");
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
