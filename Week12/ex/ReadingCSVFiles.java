package Week12.ex;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadingCSVFiles {
    public static void main(String[] args) {
        String filename = "persons.dat";
        List<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                String firstName = fields[1];
                String lastName = fields[2];
                int age = Integer.parseInt(fields[3]);
                persons.add(new Person(id, firstName, lastName, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double averageAge = persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

       
        List<Person> youngPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() < averageAge) {
                youngPersons.add(person);
            }
        }
        writeCSV("youngster.txt", youngPersons);

      
        List<Person> oldPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > averageAge) {
                oldPersons.add(person);
            }
        }
        writeCSV("old person.txt", oldPersons);
    }

    private static void writeCSV(String filename, List<Person> persons) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Person person : persons) {
                writer.write(person.getId() + "," + person.getFirstName() + ","
                        + person.getLastName() + "," + person.getAge() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class Person {
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
    }
}