import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {
    private String fileName;

    public CsvWriter(String fileName) {
        this.fileName = fileName;
    }

    public void writePersons(List<Person> persons) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (Person person : persons) {
            bw.write(person.getId() + "," + person.getFirstName() + "," + person.getLastName() + "," + person.getAge());
            bw.newLine();
        }
        bw.close();
    }
}