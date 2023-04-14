import java.util.*;

public class GradesExample {
    public static void main(String[] args) {
        // a. Create a map which stores names of students associated with their gpa.
        Map<String, Double> studentGPAs = new HashMap<>();

        // b. Add some students to the map.
        studentGPAs.put("Alice", 3.5);
        studentGPAs.put("Bob", 4.0);
        studentGPAs.put("Charlie", 3.8);
        studentGPAs.put("David", 3.2);
        studentGPAs.put("Eva", 3.9);

        // c. Find the student(s) with the highest gpa.
        double highestGPA = Collections.max(studentGPAs.values());

        List<String> studentsWithHighestGPA = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGPAs.entrySet()) {
            if (entry.getValue() == highestGPA) {
                studentsWithHighestGPA.add(entry.getKey());
            }
        }

        System.out.println("Student(s) with the highest GPA: " + studentsWithHighestGPA.toString());

        // d. Find the average gpa of all the students.
        double totalGPA = 0;
        for (double gpa : studentGPAs.values()) {
            totalGPA += gpa;
        }

        double averageGPA = totalGPA / studentGPAs.size();

        System.out.println("Average GPA of all the students: " + averageGPA);

        // e. Find the number of students who have less gpa than the average.
        int numStudentsBelowAverage = 0;
        for (double gpa : studentGPAs.values()) {
            if (gpa < averageGPA) {
                numStudentsBelowAverage++;
            }
        }

        System.out.println("Number of students who have less GPA than the average: " + numStudentsBelowAverage);
    }
}
