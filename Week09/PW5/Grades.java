import java.util.*;

public class Grades {
    
    public static void main(String[] args) {
         
        Map<String, Double> studentGPAs = new HashMap<>();
        
         
        studentGPAs.put("Alice", 3.5);
        studentGPAs.put("Bob", 3.2);
        studentGPAs.put("Charlie", 3.8);
        studentGPAs.put("David", 2.9);
        
        
        double highestGPA = Double.MIN_VALUE;
        List<String> highestGPAStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGPAs.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                highestGPAStudents.clear();
                highestGPAStudents.add(entry.getKey());
            } else if (entry.getValue() == highestGPA) {
                highestGPAStudents.add(entry.getKey());
            }
        }
        System.out.println("Student(s) with the highest GPA: " + highestGPAStudents + " (" + highestGPA + ")");
        
         double totalGPA = 0.0;
        for (double gpa : studentGPAs.values()) {
            totalGPA += gpa;
        }
        double averageGPA = totalGPA / studentGPAs.size();
        System.out.println("Average GPA of all the students: " + averageGPA);
        

        int numStudentsBelowAverage = 0;
        for (double gpa : studentGPAs.values()) {
            if (gpa < averageGPA) {
                numStudentsBelowAverage++;
            }
        }
        System.out.println("Number of students who have less GPA than the average: " + numStudentsBelowAverage);
    }
}
