package Week9;

import java.util.HashMap;
import java.util.Map;

public class GradesDemo {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Yusif", 3.8);
        studentGrades.put("Murad", 3.5);
        studentGrades.put("Arzu", 4.0);

        double highestGPA = Double.MIN_VALUE;
        for (double gpa : studentGrades.values()) {
            if (gpa > highestGPA) {
                highestGPA = gpa;
            }
        }

        System.out.println("Student(s) with the highest GPA:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() == highestGPA) {
                System.out.println(entry.getKey() + " GPA: " + entry.getValue());
            }
        }

        double totalGPA = 0.0;
        for (double gpa : studentGrades.values()) {
            totalGPA += gpa;
        }
        double averageGPA = totalGPA / studentGrades.size();

        System.out.println("Average GPA: " + averageGPA);

        int count = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGPA) {
                count++;
            }
        }

        System.out.println("Number of students with less GPA than the average: " + count);
    }
}

