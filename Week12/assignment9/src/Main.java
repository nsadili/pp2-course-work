import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvReader reader = new CsvReader("list-info.csv");
        List<Person> persons = reader.readPersons();
        int sum = 0;
        for (Person person : persons) {
            sum += person.getAge();
        }
        double averageAge = (double) sum / persons.size();

        List<Person> belowAverage = new ArrayList<>();
        List<Person> aboveAverage = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() < averageAge) {
                belowAverage.add(person);
            } else {
                aboveAverage.add(person);
            }
        }

        CsvWriter belowWriter = new CsvWriter("below-avg.csv");
        belowWriter.writePersons(belowAverage);

        CsvWriter aboveWriter = new CsvWriter("above-avg.csv");
        aboveWriter.writePersons(aboveAverage);
    }
}
