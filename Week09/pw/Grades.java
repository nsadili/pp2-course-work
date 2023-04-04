import java.util.*;
public class Grades {

    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Student 1", 3.9);
        studentGrades.put("Student 2", 3.7);
        studentGrades.put("Student 3", 4.0);
        studentGrades.put("Student 4", 3.5);

        // Find the student(s) with the highest gpa
        double maxGpa = Double.MIN_VALUE;
        String topStudent = "";
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() > maxGpa) {
                maxGpa = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("Student with highest GPA: " + topStudent + " (" + maxGpa + ")");

        // Find the average gpa of all the students
        double totalGpa = 0.0;
        int numStudents = studentGrades.size();
        for (Double gpa : studentGrades.values()) {
            totalGpa += gpa;
        }
        double avgGpa = totalGpa / numStudents;
        System.out.println("Average GPA: " + avgGpa);

        // Find the number of students who have less gpa than the average
        int numBelowAvg = 0;
        for (Double gpa : studentGrades.values()) {
            if (gpa < avgGpa) {
                numBelowAvg++;
            }
        }
        System.out.println("Number of students below average GPA: " + numBelowAvg);
    }

}
