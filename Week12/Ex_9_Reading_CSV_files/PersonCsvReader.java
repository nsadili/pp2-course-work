import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonCsvReader {
    public static void main(String[] args) {
        String csvFile = "Persons.csv";
        String line;
        String cvsSplitBy = ",";
        List<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                int id = Integer.parseInt(data[0]);
                String firstName = data[1];
                String lastName = data[2];
                int age = Integer.parseInt(data[3]);
                persons.add(new Person(id, firstName, lastName, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(getAverageAge(persons));
        writePersonsUnderAverageAge(persons, getAverageAge(persons), "Result.csv");
        writePersonsAboveAverageAge(persons, getAverageAge(persons), "Result2.csv");


    }

    //d. Find average age of all the persons
    public static double getAverageAge(List<Person> persons) {
        int sum = 0;
        for (Person person : persons) {
            sum += person.getAge();
        }
        return (double) sum / persons.size();
    }

    //e. Find the persons that are under the average age and store them in a new .csv file
    public static void writePersonsUnderAverageAge(List<Person> persons, double averageAge, String outputCsvFile) {
        try (PrintWriter writer = new PrintWriter(new File(outputCsvFile))) {
            StringBuilder sb = new StringBuilder();
            for (Person person : persons) {
                if (person.getAge() < averageAge) {
                    sb.append(person.getId()).append(",");
                    sb.append(person.getFirstName()).append(",");
                    sb.append(person.getLastName()).append(",");
                    sb.append(person.getAge()).append("\n");
                }
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //f. To find the persons that are above the average age and store them in a new .csv file, you can use the following code:
    public static void writePersonsAboveAverageAge(List<Person> persons, double averageAge, String outputCsvFile) {
        try (PrintWriter writer = new PrintWriter(new File(outputCsvFile))) {
            StringBuilder sb = new StringBuilder();
            for (Person person : persons) {
                if (person.getAge() > averageAge) {
                    sb.append(person.getId()).append(",");
                    sb.append(person.getFirstName()).append(",");
                    sb.append(person.getLastName()).append(",");
                    sb.append(person.getAge()).append("\n");
                }
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
