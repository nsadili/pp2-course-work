package Week09;

import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Gunel", 3.8);
        studentGrades.put("Dilara", 3.6);
        

        double highestGpa = Double.MIN_VALUE;
        for (double gpa : studentGrades.values()) {
            if (gpa > highestGpa) {
                highestGpa = gpa;
            }
        }

        System.out.println("Student(s) with the highest GPA:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() == highestGpa) {
                System.out.println(entry.getKey());
            }
        }

        double totalGpa = 0.0;
        for (double gpa : studentGrades.values()) {
            totalGpa += gpa;
        }
        double averageGpa = totalGpa / studentGrades.size();
        System.out.println("Average GPA: " + averageGpa);

        int count = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGpa) {
                count++;
            }
        }
        System.out.println("Number of students with GPA less than the average: " + count);
    }
}
