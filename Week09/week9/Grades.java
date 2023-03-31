package pp2.week9;

import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> studentGPA = new HashMap<>();
        
        studentGPA.put("Lucifer", 3.7);
        studentGPA.put("Amenadiel", 3.9);
        studentGPA.put("Ezekiel", 3.5);
        studentGPA.put("Azrael", 3.8);
        studentGPA.put("Remiel", 3.2);
        
        double highestGPA = Collections.max(studentGPA.values());
        List<String> topStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() == highestGPA) {
                topStudents.add(entry.getKey());
            }
        }
        System.out.println("Student(s) with highest GPA: " + topStudents);
        
        double totalGPA = 0.0;
        for (double gpa : studentGPA.values()) {
            totalGPA += gpa;
        }
        double averageGPA = totalGPA / studentGPA.size();
        System.out.println("Average GPA: " + averageGPA);
        
        int numBelowAverage = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < averageGPA) {
                numBelowAverage++;
            }
        }
        System.out.println("Number of students with less GPA than the average: " + numBelowAverage);
    }
}
