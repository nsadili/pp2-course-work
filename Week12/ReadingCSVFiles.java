import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingCSVFiles {

    private static final String PERSONS_DATA_FILE = "persons.csv";
    public static void main(String[] args) {
        //loadPersons();
        List<Person> all = loadPersons();

        List<Person> sorted = new ArrayList<>(all);

        sorted.sort((p1, p2) -> p1.getAge() - p2.getAge());

        System.out.println(all);
        System.out.println();
        System.out.println(sorted);
    }

    /* public static void loasPersons() {
        if(! new File(PERSONS_DATA_FILE).exists()) return;

        try(BufferedReader br = new BufferedReader(new FileReader(PERSONS_DATA_FILE))) {
            String line = null;
            while((line = br.readLine()) != null)
                System.out.println(line);
        }catch(IOException e) {
            e.printStackTrace();
        }
    } */

    public static List<Person> loadPersons() {
       // System.out.println(new File(PERSONS_DATA_FILE).getAbsolutePath());

        if(!new File(PERSONS_DATA_FILE).exists()) return new ArrayList<>();

        List<Person> persons = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(PERSONS_DATA_FILE))) {
            br.readLine(); //skip the HEADER
            String line = null;
            while((line = br.readLine()) != null)
                persons.add(parseToPerson(line));
        }catch(IOException e) {
            e.printStackTrace();
        }

        return persons;
    }

    public static Person parseToPerson(String line) {
        String[] tokens = line.split(",");

        return new Person(
            Integer.parseInt(tokens[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3])
        );
    }
    
}

class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
  
}
