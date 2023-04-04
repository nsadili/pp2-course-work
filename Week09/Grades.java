import java.util.*;

public class Grades {
    public static void main(String[] args) {
        // Create a Map to store student names and GPA
        Map<String, Double> studentGPA = new HashMap<>();
        
        // Add students name to the map
        studentGPA.put("Nazrin", 3.0);
        studentGPA.put("Murad", 3.9);
        studentGPA.put("Zahira", 3.5);
        
        // Find the student(s) with the highest GPA
        Double maxGPA = Collections.max(studentGPA.values());
        List<String> highestGPAStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue().equals(maxGPA)) {
                highestGPAStudents.add(entry.getKey());
            }
        }
        System.out.println("Student(s) with the highest GPA: " + highestGPAStudents);
        
        // Find the average GPA of all the students
        Double sum = 0.0;
        for (Double gpa : studentGPA.values()) {
            sum += gpa;
        }
        Double avgGPA = sum / studentGPA.size();
        System.out.println("Average GPA: " + avgGPA);
        
        // Find the number of students who have less GPA than the average
        int lessThanAvgCount = 0;
        for (Double gpa : studentGPA.values()) {
            if (gpa < avgGPA) {
                lessThanAvgCount++;
            }
        }
        System.out.println("Number of students with less GPA than the average: " + lessThanAvgCount);
    }
}