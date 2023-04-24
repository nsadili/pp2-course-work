import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReadingCSVFiles {

    private static final String PERSONS_DATA_FILE = "Resources/persons.csv";

    public static void main(String[] args) {

        List<Person> all = loadPersons();

        List<Person> sorted = new ArrayList<>(all);
        sorted.sort((p1, p2) -> p1.getAge() - p2.getAge());

        System.out.println(sorted);

        final String SEARCH_WORD = "Ali".toLowerCase();

        var filtered = all.stream().filter(
                p -> p.getFirstName().toLowerCase().contains(SEARCH_WORD) ||
                        p.getLastName().toLowerCase().contains(SEARCH_WORD))
                .collect(Collectors.toList());

        System.out.println(filtered);

        System.out.println(all);
    }

    public static List<Person> loadPersons() {

        if (!new File(PERSONS_DATA_FILE).exists())
            return new ArrayList<>();

        List<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(PERSONS_DATA_FILE))) {
            br.readLine(); // skip the headers (Column names)

            String line = null;

            while ((line = br.readLine()) != null)
                // System.out.println(line);

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
                Integer.parseInt(tokens[3])); // age

    }


    // public static int averageAge(String line) {
        //        int age = 0;
        //        int len;
        //         String[] tokens = line.split(",");
        //         try (BufferedReader br = new BufferedReader(new FileReader(PERSONS_DATA_FILE))) {
                  
        //         //     while(br.readLine() != null) 
        //         //     age += Integer.parseInt(tokens[br.readLine()]);
        //         // }
        //         return age;
        //     }
        // }

}

class Person {
    private int ID;
    private String FirstName;
    private String LastName;
    private int age;

    public Person(int iD, String firstName, String lastName, int age) {
        ID = iD;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age + "]";
    }

}