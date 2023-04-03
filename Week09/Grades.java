package Week09;
import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Leyla", 3.1);
        studentGrades.put("Farid", 4.0);
        studentGrades.put("Fuad", 3.6);
        studentGrades.put("Riad", 2.8);
        studentGrades.put("Mammad", 1.5);
        double highestGpa = Double.MIN_VALUE;
        String highestGpaStudent = "";
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() > highestGpa) {
                highestGpa = entry.getValue();
                highestGpaStudent = entry.getKey();
            }
        }
        System.out.println("student with highest GPA: " + highestGpaStudent);
        double totalGpa = 0.0;
        for (double gpa : studentGrades.values()) {
            totalGpa += gpa;
        }
        double averageGpa = totalGpa / studentGrades.size();
        System.out.println("average GPA of all students: " + averageGpa);
        int count = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGpa) {
                count++;
            }
        }
        System.out.println("number of students with less GPA than average: " + count);
    }
}