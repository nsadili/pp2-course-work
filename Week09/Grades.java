package Week09;

import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> studentGPAs = new HashMap<>();

        studentGPAs.put("Abov", 3.7);
        studentGPAs.put("Namiq", 4.0);
        studentGPAs.put("Eli", 2.9);
        studentGPAs.put("Rail", 3.5);

        String highestGPAStudent = "";
        double highestGPA = 0.0;
        for (Map.Entry<String, Double> entry : studentGPAs.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                highestGPAStudent = entry.getKey();
            }
        }
        System.out.println("Student(s) with the highest GPA: " + highestGPAStudent);

        double sum = 0.0;
        for (double gpa : studentGPAs.values()) {
            sum += gpa;
        }
        double averageGPA = sum / studentGPAs.size();
        System.out.println("Average GPA: " + averageGPA);

        int numBelowAverage = 0;
        for (double gpa : studentGPAs.values()) {
            if (gpa < averageGPA) {
                numBelowAverage++;
            }
        }
        System.out.println("Number of students with GPA below average: " + numBelowAverage);
    }
}
