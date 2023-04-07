package Week9;
import java.util.HashMap;
import java.util.Map;

public class Grades {

    public static void main(String[] args) {

        // Part a: Create a map which stores names of students associated with their gpa
        Map<String, Double> studentGrades = new HashMap<>();

        // Part b: Add some students to the map
        studentGrades.put("Ali", 3.5);
        studentGrades.put("Babek", 3.8);
        studentGrades.put("Cahid", 2.9);
        studentGrades.put("David", 3.1);

        // Part c: Find the student(s) with the highest gpa
        double highestGPA = Double.MIN_VALUE;
        String highestGPASudent = "";

        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                highestGPASudent = entry.getKey();
            }
        }

        System.out.println("The student(s) with the highest GPA is/are: " + highestGPASudent);

        // Part d: Find the average gpa of all the students
        double totalGPA = 0.0;
        for (double gpa : studentGrades.values()) {
            totalGPA += gpa;
        }

        double averageGPA = totalGPA / studentGrades.size();
        System.out.println("The average GPA of all the students is: " + averageGPA);

        // Part e: Find the number of students who have less gpa than the average
        int count = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGPA) {
                count++;
            }
        }

        System.out.println("The number of students who have less GPA than the average is: " + count);
    }
}

