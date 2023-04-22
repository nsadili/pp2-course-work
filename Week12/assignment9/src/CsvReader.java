import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private String fileName;

    public CsvReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Person> readPersons() throws IOException {
        List<Person> persons = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            int id = Integer.parseInt(values[0]);
            String firstName = values[1];
            String lastName = values[2];
            int age = Integer.parseInt(values[3]);
            Person person = new Person(id, firstName, lastName, age);
            persons.add(person);
        }
        br.close();
        return persons;
    }
}