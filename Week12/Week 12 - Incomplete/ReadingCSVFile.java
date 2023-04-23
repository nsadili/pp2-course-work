import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingCSVFile {

    private static final String PERSONS_DATA_FILE = "data/persons.csv";

    public static void main(String[] args) {
        List<Person> all = loadPersons();

        List<Person> sorted = new ArrayList<>(all);

        sorted.sort((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(all);

        System.out.println();

        final String SEARCH_WORD = "Ali".toLowerCase();

        var filtered = all.stream()
                .filter(p -> p.getFirstName().toLowerCase().contains(SEARCH_WORD)
                        || p.getLastName().toLowerCase().contains(SEARCH_WORD))
                .collect(Collectors.toList());

        System.out.println(filtered);
    }

    public static List<Person> loadPersons() {
        if (!new File(PERSONS_DATA_FILE).exists())
            return new ArrayList<>();

        List<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(PERSONS_DATA_FILE))) {
            br.readLine(); // skip the HEADER (column names)

            String line = null;
            while ((line = br.readLine()) != null)
                try {
                    persons.add(parseToPerson(line));
                } catch (Exception e) {
                }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return persons;
    }

    public static Person parseToPerson(String line) {
        // 1,Nuraddin,Sadili,30
        String[] tokens = line.split(",");

        return new Person(
                Integer.parseInt(tokens[0]), // id
                tokens[1], // fname
                tokens[2], // lname
                Integer.parseInt(tokens[3]) // age
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }

}