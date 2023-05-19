import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private static final String CSV_SEPARATOR = ",";

    public static List<Person> readCSV(String fileName) {
        List<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(CSV_SEPARATOR);
                if (fields.length == 4) {
                    int id = Integer.parseInt(fields[0]);
                    String firstName = fields[1];
                    String lastName = fields[2];
                    int age = Integer.parseInt(fields[3]);

                    Person person = new Person(id, firstName, lastName, age);
                    persons.add(person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return persons;
    }
}
