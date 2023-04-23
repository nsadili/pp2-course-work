import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingCSVFiles {
    private static final String PERSONS_DATA_FILE = "persons.csv";
    public static void main(String[] args) {
        List<Person> all = loadPersons();
        System.out.println(all);
    }

    public static List<Person> loadPersons() {
        if(!new File(PERSONS_DATA_FILE).exists()) return new ArrayList<>();
        List<Person> persons = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(PERSONS_DATA_FILE))) {
            br.readLine();
            String line = null;
            while((line=br.readLine())!= null) try{
                persons.add(parseToPerson(line));
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public static Person parseToPerson(String line) {
        String[] tokens = line.split(",");
        return new Person(
            Integer.parseInt(tokens[0]),
            tokens[1],
            tokens[2],
            Integer.parseInt(tokens[3]));
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    

}
