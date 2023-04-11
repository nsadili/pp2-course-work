package EX;

import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> studentGPA = new HashMap<>();

        studentGPA.put("Alice", 3.9);
        studentGPA.put("Bob", 3.5);
        studentGPA.put("Charlie", 2.7);
        studentGPA.put("Dave", 4.0);

        double highestGPA = 0.0;
        for (double gpa : studentGPA.values()) {
            if (gpa > highestGPA) {
                highestGPA = gpa;
            }
        }
        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() == highestGPA) {
                System.out.println(entry.getKey() + " has the highest GPA of " + highestGPA);
            }
        }

        double sum = 0.0;
        for (double gpa : studentGPA.values()) {
            sum += gpa;
        }
        double averageGPA = sum / studentGPA.size();
        System.out.println("The average GPA of all the students is " + averageGPA);

        int count = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < averageGPA) {
                count++;
            }
        }
        System.out.println(count + " students have less GPA than the average");
    }
}
