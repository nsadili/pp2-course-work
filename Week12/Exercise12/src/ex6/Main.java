package ex6;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Person[] people = {new Person("Ali"), new Person("Bobert"),
                        new Person("Yamada"), new Person("Zaugh")};
        savePerson(people, "./Exercise12/src/ex6/PersonsBi.txt");
        readPerson("./Exercise12/src/ex6/PersonsBi.txt");
    }

    public static void savePerson(Person[] persons, String file) {
        try {
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(file));
            objOut.writeObject(persons);
            objOut.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }   

    public static void readPerson(String file) {
        try {
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(file));
            Person[] persons = (Person[]) objIn.readObject();

            for (Person x: persons)
                System.out.println(x.toString());
            objIn.close();
        } catch (EOFException e) {
            System.out.println("Finished reading.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + "]";
    }
}
