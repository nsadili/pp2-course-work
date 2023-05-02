import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingCSVFiles {
    private static final String PERSONS_DATA_FILE = "data/persons.csv";

    public static void main(String[] args) {
        List<Person> all = loadPersons();

        List<Person> sorted = new ArrayList<>(all);

        sorted.sort((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(all);

        System.out.println();

        final String SEARCH_WORD = "Vasila".toLowerCase();

        var filtered = all.stream()
                .filter(p -> p.getFname().toLowerCase().contains(SEARCH_WORD)
                        || p.getLname().toLowerCase().contains(SEARCH_WORD))
                .collect(Collectors.toList());

        System.out.println(filtered);
    }

    public static List<Person> loadPersons() {
        if (!new File(PERSONS_DATA_FILE).exists())
            return new ArrayList<>();
        List<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(PERSONS_DATA_FILE))) {
            br.readLine(); // skip the header(first line)
            String line = null;
            while ((line = br.readLine()) != null)
                System.out.println(line);

        } catch (IOException e) {
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
    int id;
    String fname;
    String lname;
    int age;

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