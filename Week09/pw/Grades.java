import java.util.*;

public class Grades {
    public static void main(String[] args) {
      
        Map<String, Double> studentGPA = new HashMap<>();

        studentGPA.put("Emily", 3.5);
        studentGPA.put("Jane", 2.7);
        studentGPA.put("Alex", 3.4);
        studentGPA.put("Sara", 2.8);
        studentGPA.put("Ali", 4.0);

        // student with the highest gpa
        double maxGPA = Collections.max(studentGPA.values());
        List<String> topStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() == maxGPA) {
                topStudents.add(entry.getKey());
            }
        }
        System.out.println("the stutends with the highest GPA: " + topStudents);

        // Find the average gpa of all the students
        double sumGPA = 0.0;
        for (double gpa : studentGPA.values()) {
            sumGPA += gpa;
        }
        double avgGPA = sumGPA / studentGPA.size();
        System.out.println("The average GPA of all the students: " + avgGPA);

        int count = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < avgGPA) {
                count++;
            }
        }
        System.out.println("The number of students who have less GPA than the average: " + count);
    }
}
