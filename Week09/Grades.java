import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        // Create a map to store student names and their GPAs
        Map<String, Double> studentGrades = new HashMap<>();

        // Add some students to the map
        studentGrades.put("Alice", 3.7);
        studentGrades.put("Bob", 3.9);
        studentGrades.put("Charlie", 3.5);
        studentGrades.put("David", 3.8);
        studentGrades.put("Eve", 4.0);

        // Find the student(s) with the highest GPA
        double highestGpa = 0.0;
        for (double gpa : studentGrades.values()) {
            if (gpa > highestGpa) {
                highestGpa = gpa;
            }
        }

        // Print the student(s) with the highest GPA
        System.out.println("Student(s) with the highest GPA:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() == highestGpa) {
                System.out.println(entry.getKey());
            }
        }

        // Find the average GPA of all the students
        double totalGpa = 0.0;
        for (double gpa : studentGrades.values()) {
            totalGpa += gpa;
        }
        double averageGpa = totalGpa / studentGrades.size();

        // Print the average GPA
        System.out.println("Average GPA: " + averageGpa);

        // Find the number of students who have less GPA than the average
        int count = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGpa) {
                count++;
            }
        }

        // Print the number of students with less GPA than the average
        System.out.println("Number of students with less GPA than the average: " + count);
    }
}
