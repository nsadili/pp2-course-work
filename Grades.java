import java.util.HashMap;
import java.util.Map;

public class Grades {
    
    public static void main(String[] args) {
        // create a map to store student names and their GPAs
        Map<String, Double> studentGPAs = new HashMap<>();
        
        // add some students to the map
        studentGPAs.put("Alice", 3.5);
        studentGPAs.put("Bob", 3.2);
        studentGPAs.put("Charlie", 3.9);
        studentGPAs.put("David", 2.8);
        studentGPAs.put("Emma", 3.7);
        
        // find the student(s) with the highest GPA
        String topStudent = "";
        double topGPA = 0;
        for (String name : studentGPAs.keySet()) {
            double gpa = studentGPAs.get(name);
            if (gpa > topGPA) {
                topStudent = name;
                topGPA = gpa;
            }
        }
        System.out.println("Student with highest GPA: " + topStudent + " (" + topGPA + ")");
        
        // find the average GPA of all students
        double sumGPAs = 0;
        for (double gpa : studentGPAs.values()) {
            sumGPAs += gpa;
        }
        double avgGPA = sumGPAs / studentGPAs.size();
        System.out.println("Average GPA of all students: " + avgGPA);
        
        // find the number of students with less GPA than the average
        int numBelowAvg = 0;
        for (double gpa : studentGPAs.values()) {
            if (gpa < avgGPA) {
                numBelowAvg++;
            }
        }
        System.out.println("Number of students with GPA below average: " + numBelowAvg);
    }
}
