import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ali", 25, "female"),
                new Person("Nihat", 30, "male"),
                new Person("Farhad", 35, "male")
        };

        String filename = "people.bin";

  
        savePeopleToFile(people, filename);

     
        readPeopleFromFile(filename);
    }

    public static void savePeopleToFile(Person[] people, String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(people);
            objectOut.close();
            fileOut.close();
            System.out.println("Successfully saved people to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readPeopleFromFile(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Person[] people = (Person[]) objectIn.readObject();
            objectIn.close();
            fileIn.close();

            for (Person person : people) {
                System.out.println(person);
            }
        } catch (EOFException e) {
      
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}