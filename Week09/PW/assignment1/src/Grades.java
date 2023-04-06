import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Jeyhun", 3.2);
        studentGrades.put("Asad", 3.5);
        studentGrades.put("Vasif", 3.0);
        studentGrades.put("Farhad", 3.6);
        studentGrades.put("Aydan", 4.0);

        String topStudent = "";
        double highestGPA = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("The student with the highest GPA is " + topStudent + " with a GPA of " + highestGPA);

        double totalGPA = 0;
        for (double gpa : studentGrades.values()) {
            totalGPA += gpa;
        }
        double avgGPA = totalGPA / studentGrades.size();
        System.out.println("The average GPA of all the students is " + avgGPA);

        int numBelowAvg = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < avgGPA) {
                numBelowAvg++;
            }
        }
        System.out.println("The number of students who have less GPA than the average is " + numBelowAvg);
    }
}