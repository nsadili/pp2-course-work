import java.util.*;

public class Grades {
    public static void main(String[] args) {
        System.out.println("a. Create a map which stores names of students associated with their gpa.");
        Map<String, Double> studentGPAMap = new HashMap<>();

        System.out.println("b. Add some students to the map.");
        studentGPAMap.put("John Doe", 3.5);
        studentGPAMap.put("Jane Smith", 4.0);
        studentGPAMap.put("Bob Johnson", 2.8);
        studentGPAMap.put("Sara Lee", 3.7);
        studentGPAMap.put("Mike Adams", 3.2);

        System.out.println("c. Find the student(s) with the highest gpa.");
        double maxGPA = Double.MIN_VALUE;
        List<String> topStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGPAMap.entrySet()) {
            if (entry.getValue() > maxGPA) {
                maxGPA = entry.getValue();
                topStudents.clear();
                topStudents.add(entry.getKey());
            } else if (entry.getValue() == maxGPA) {
                topStudents.add(entry.getKey());
            }
        }
        System.out.println("Student(s) with the highest GPA: " + topStudents);

        System.out.println("d. Find the average gpa of all the students.");
        double sumGPA = 0.0;
        for (double gpa : studentGPAMap.values()) {
            sumGPA += gpa;
        }
        double avgGPA = sumGPA / studentGPAMap.size();
        System.out.println("Average GPA of all students: " + avgGPA);

        System.out.println("e. Find the number of students who have less gpa than the average.");
        int belowAvgCount = 0;
        for (double gpa : studentGPAMap.values()) {
            if (gpa < avgGPA) {
                belowAvgCount++;
            }
        }
        System.out.println("Number of students with GPA less than average: " + belowAvgCount);
    }
}
