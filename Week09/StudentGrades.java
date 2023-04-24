import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        // Create a map to store names of students associated with their GPA
        Map<String, Double> studentGpaMap = new HashMap<>();

        // Add some students to the map
        studentGpaMap.put("Alice", 3.8);
        studentGpaMap.put("Bob", 3.6);
        studentGpaMap.put("Charlie", 3.9);
        studentGpaMap.put("David", 3.7);
        studentGpaMap.put("Eve", 4.0);

        // Find the student(s) with the highest GPA
        double maxGpa = Double.MIN_VALUE;
        String highestGpaStudent = null;
        for (Map.Entry<String, Double> entry : studentGpaMap.entrySet()) {
            String student = entry.getKey();
            double gpa = entry.getValue();
            if (gpa > maxGpa) {
                maxGpa = gpa;
                highestGpaStudent = student;
            }
        }
        System.out.println("Student with highest GPA: " + highestGpaStudent + ", GPA: " + maxGpa);

        // Find the average GPA of all students
        double totalGpa = 0.0;
        int numStudents = studentGpaMap.size();
        for (double gpa : studentGpaMap.values()) {
            totalGpa += gpa;
        }
        double averageGpa = totalGpa / numStudents;
        System.out.println("Average GPA: " + averageGpa);

        // Find the number of students who have GPA less than the average
        int numStudentsBelowAverage = 0;
        for (double gpa : studentGpaMap.values()) {
            if (gpa < averageGpa) {
                numStudentsBelowAverage++;
            }
        }
        System.out.println("Number of students with GPA less than average: " + numStudentsBelowAverage);
    }
}
