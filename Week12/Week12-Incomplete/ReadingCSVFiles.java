import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
    private int id;
    private String fname;
    private String lname;
    private int age;

    public Person(int id, String fname, String lname, int age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
    }

}

public class ReadingCSVFiles {

    private final static String PERSON_FILE_PATH = "Resources/person.csv";

    public static void main(String[] args) {
        try {
            // System.out.println(loadPersons());
            List<Person> personsFinal = loadPersons();
            // System.out.println(personsFinal);

            List<Person> personsSorted = new ArrayList<>(personsFinal);
            personsSorted.sort((p1, p2)->p1.getAge()-p2.getAge());
            // System.out.println(personsSorted);

            final String SEARCH_DATA = "rUFat".toLowerCase();
            List<Person> personsSearched = personsFinal.stream().filter(p->p.getFname().toLowerCase().contains(SEARCH_DATA)
            ||p.getLname().toLowerCase().contains(SEARCH_DATA)).collect(Collectors.toList());
            System.out.println(personsSearched);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }




        

    }

    public static List<Person> loadPersons() throws FileNotFoundException {
        List<Person> persons = new ArrayList<>();
        if (!(new File(PERSON_FILE_PATH).exists()))
            throw new FileNotFoundException();

        try (BufferedReader br = new BufferedReader(new FileReader(PERSON_FILE_PATH));) {
            br.readLine();
            String line = null;
            while ((line = br.readLine()) != null) {
                persons.add(parseToPerson(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;

    }

    public static Person parseToPerson(String line) {
        String[] tokens = line.split(",");
        return new Person(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3]));
    }
}
