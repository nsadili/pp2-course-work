package Week09;
import java.util.*;

public class Grades {
    
    public static void main(String[] args) {
        
        Map<String, Double> studentGPA = new HashMap<>();
        
        studentGPA.put("Murad", 3.8);
        studentGPA.put("Emin", 3.5);
        studentGPA.put("Kamil", 4.0);
        studentGPA.put("Gulnar", 3.9);
        studentGPA.put("Tofiq", 3.7);
        
        double highestGPA = Double.MIN_VALUE;
        List<String> highestGPAStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                highestGPAStudents.clear();
                highestGPAStudents.add(entry.getKey());
            } else if (entry.getValue() == highestGPA) {
                highestGPAStudents.add(entry.getKey());
            }
        }
        System.out.println("Student(s) with the highest GPA: " + highestGPAStudents);
        
        double sumGPA = 0;
        for (double gpa : studentGPA.values()) {
            sumGPA += gpa;
        }
        double avgGPA = sumGPA / studentGPA.size();
        System.out.println("Average GPA: " + avgGPA);
        
        int lessThanAvgCount = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < avgGPA) {
                lessThanAvgCount++;
            }
        }
        System.out.println("Number of students who have less GPA than the average: " + lessThanAvgCount);
    }
}
