import java.io.*;
import java.util.*;

public class CSVReaderDemo {

    static class Person {
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

        public String toString() {
            return id + "," + firstName + "," + lastName + "," + age;
        }
    }

    public static List<Person> readCSV(String filePath) {
        List<Person> persons = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                String firstName = fields[1];
                String lastName = fields[2];
                int age = Integer.parseInt(fields[3]);
                persons.add(new Person(id, firstName, lastName, age));
            }
            br.close();
            System.out.println("CSV file read successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public static int calculateAverageAge(List<Person> persons) {
        int sum = 0;
        for (Person person : persons) {
            sum += person.getAge();
        }
        return sum / persons.size();
    }

    public static List<Person> filterPersons(List<Person> persons, int threshold, boolean isAbove) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (isAbove && person.getAge() >= threshold) {
                filteredPersons.add(person);
            } else if (!isAbove && person.getAge() < threshold) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

    public static void writeCSV(List<Person> persons, String filePath) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            for (Person person : persons) {
                bw.write(person.toString() + "\n");
            }
            bw.close();
            System.out.println("CSV file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "ListofPeople.csv";
        List<Person> persons = readCSV(filePath);
        int averageAge = calculateAverageAge(persons);
        System.out.println("Average age: " + averageAge);
        List<Person> underAgePersons = filterPersons(persons, averageAge, false);
        writeCSV(underAgePersons, "underage_persons.csv");
        List<Person> aboveAgePersons = filterPersons(persons, averageAge, true);
        writeCSV(aboveAgePersons, "aboveage_persons.csv");
    }
}