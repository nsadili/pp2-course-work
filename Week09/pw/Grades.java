import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Islam", 3.8);
        studentGrades.put("Nihat", 3.9);
        studentGrades.put("Ibrahim", 3.5);
        studentGrades.put("Senan", 4.0);
        studentGrades.put("Amal", 3.7);
        double highestGPA = Double.MIN_VALUE;
        for (double gpa : studentGrades.values()) {
            if (gpa > highestGPA) {
                highestGPA = gpa;
            }
        }

        System.out.println("Student(s) with the highest GPA:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() == highestGPA) {
                System.out.println(entry.getKey());
            }
        }

        double totalGPA = 0.0;
        for (double gpa : studentGrades.values()) {
            totalGPA += gpa;
        }
        double averageGPA = totalGPA / studentGrades.size();

        System.out.println("Average GPA of all students: " + averageGPA);
        int countBelowAverage = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGPA) {
                countBelowAverage++;
            }
        }

        System.out.println("Number of students with a GPA lower than the average: " + countBelowAverage);
    }
}
