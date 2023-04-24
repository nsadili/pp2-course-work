import java.io.*;
import java.util.*;

class Person {
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

    @Override
    public String toString() {
        return id + "," + firstName + "," + lastName + "," + age;
    }
}

public class CsvFileProcessor {
    public static void main(String[] args) {
        String fileName = "persons.csv";
        List<Person> persons = readCsvFile(fileName);
        double avgAge = getAverageAge(persons);
        System.out.println("Average age of all persons: " + avgAge);
        List<Person> personsBelowAvgAge = getPersonsBelowAvgAge(persons, avgAge);
        String belowAvgAgeFileName = "belowAvgAge.csv";
        writeCsvFile(personsBelowAvgAge, belowAvgAgeFileName);
        List<Person> personsAboveAvgAge = getPersonsAboveAvgAge(persons, avgAge);
        String aboveAvgAgeFileName = "aboveAvgAge.csv";
        writeCsvFile(personsAboveAvgAge, aboveAvgAgeFileName);
    }

    public static List<Person> readCsvFile(String fileName) {
        List<Person> persons = new ArrayList<>();
        try {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public static double getAverageAge(List<Person> persons) {
        int totalAge = 0;
        for (Person person : persons) {
            totalAge += person.getAge();
        }
        return (double) totalAge / persons.size();
    }

    public static List<Person> getPersonsBelowAvgAge(List<Person> persons, double avgAge) {
        List<Person> personsBelowAvgAge = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() < avgAge) {
                personsBelowAvgAge.add(person);
            }
        }
        return personsBelowAvgAge;
    }

    public static List<Person> getPersonsAboveAvgAge(List<Person> persons, double avgAge) {
        List<Person> personsAboveAvgAge = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > avgAge) {
                personsAboveAvgAge.add(person);
            }
        }
        return personsAboveAvgAge;
    }

    public static void writeCsvFile(List<Person> persons, String fileName) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for (Person person : persons) {
                bw.write(person.toString() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
