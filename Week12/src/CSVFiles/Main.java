package CSVFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "persons.csv";
        String newFileUnderName = "under_average.csv";
        String newFileOverName = "over_average.csv";
        List<Person> persons = readPersonsFromFile(fileName);
        int totalAge = 0;
        for (Person person : persons) {
            totalAge += person.getAge();
        }
        double averageAge = (double) totalAge / persons.size();
        System.out.println("Average age: " + averageAge);
        List<Person> underAverage = new ArrayList<>();
        List<Person> overAverage = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() < averageAge) {
                underAverage.add(person);
            } else {
                overAverage.add(person);
            }
        }
        writePersonsToFile(newFileUnderName, underAverage);
        writePersonsToFile(newFileOverName, overAverage);
    }

    private static List<Person> readPersonsFromFile(String fileName) {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

    private static void writePersonsToFile(String fileName, List<Person> persons) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Person person : persons) {
                writer.printf("%d,%s,%s,%d%n", person.getId(), person.getFirstName(), person.getLastName(),
                        person.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
