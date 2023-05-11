package ex9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static void main(String[] args) {
        String csvFile = "persons.csv";
        String line = "";
        String csvSplitBy = ",";
        List<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                int id = Integer.parseInt(data[0]);
                String firstName = data[1];
                String lastName = data[2];
                int age = Integer.parseInt(data[3]);

                persons.add(new Person(id, firstName, lastName, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("List of persons:");
        for (Person person : persons) {
            System.out.println(person.getId() + ", " + person.getFirstName() + ", " + person.getLastName() + ", " + person.getAge());
        }
    }
}

