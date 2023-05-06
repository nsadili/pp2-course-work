package Week09;

import java.util.HashMap;
import java.util.Map;

public class Grades {
    
    private Map<String, Double> studentsGPA = new HashMap<>();
    
    public void addStudent(String name, double gpa) {
        studentsGPA.put(name, gpa);
    }
    
    public String getHighestGPAStudent() {
        String highestGPAStudent = null;
        double highestGPA = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : studentsGPA.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                highestGPAStudent = entry.getKey();
            }
        }
        return highestGPAStudent;
    }
    
    public double getAverageGPA() {
        double totalGPA = 0;
        for (double gpa : studentsGPA.values()) {
            totalGPA += gpa;
        }
        return totalGPA / studentsGPA.size();
    }
    
    public int getNumberOfStudentsBelowAverage() {
        double averageGPA = getAverageGPA();
        int count = 0;
        for (double gpa : studentsGPA.values()) {
            if (gpa < averageGPA) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.addStudent("Nijat", 3.8);
        grades.addStudent("Ali", 4.0);
        grades.addStudent("Huseyn", 2.7);
        grades.addStudent("Asiman", 3.9);
        
        System.out.println("Student with the highest GPA: " + grades.getHighestGPAStudent());
        System.out.println("Average GPA: " + grades.getAverageGPA());
        System.out.println("Number of students with less GPA than the average: " + grades.getNumberOfStudentsBelowAverage());
    }
}