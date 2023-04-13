import java.util.*;

public class StudentGPA {

    public static void main(String[] args) {
        // create a map to store students and their GPAs
        Map<String, Double> studentGPA = new HashMap<>();

        // add some students to the map
        studentGPA.put("Tofig", 3.5);
        studentGPA.put("Sama", 3.2);
        studentGPA.put("Asma", 3.8);
        studentGPA.put("Murad", 3.7);
        studentGPA.put("Riad", 3.1);

        // find the student with the highest GPA
        String highestGPAStudent = Collections.max(studentGPA.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Student with highest GPA: " + highestGPAStudent);

        // find the average GPA of all students
        double sum = 0.0;
        for (double gpa : studentGPA.values()) {
            sum += gpa;
        }
        double averageGPA = sum / studentGPA.size();
        System.out.println("Average GPA: " + averageGPA);

        // find the number of students who have less GPA than the average
        int count = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < averageGPA) {
                count++;
            }
        }
        System.out.println("Number of students with less GPA than the average: " + count);
    }
}
