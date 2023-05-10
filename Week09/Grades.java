package Week09;

import java.util.HashMap;
import java.util.Map;

public class Grades {
    
    private Map<String, Double> studentGPAMap;
    
    public Grades() {
        this.studentGPAMap = new HashMap<>();
    }
    
    public void addStudent(String name, double gpa) {
        studentGPAMap.put(name, gpa);
    }
    
    public String getTopStudents() {
        StringBuilder topStudents = new StringBuilder();
        double maxGpa = Double.MIN_VALUE;
        
        for (Map.Entry<String, Double> entry : studentGPAMap.entrySet()) {
            if (entry.getValue() > maxGpa) {
                maxGpa = entry.getValue();
                topStudents.setLength(0); 
                topStudents.append(entry.getKey());
            } else if (entry.getValue() == maxGpa) {
                topStudents.append(", ").append(entry.getKey());
            }
        }
        return topStudents.toString();
    }
    
    public double getAverageGPA() {
        double sum = 0.0;
        for (Map.Entry<String, Double> entry : studentGPAMap.entrySet()) {
            sum += entry.getValue();
        }
        return sum / studentGPAMap.size();
    }
    
    public int countBelowAverage() {
        int count = 0;
        double avg = getAverageGPA();
        for (Map.Entry<String, Double> entry : studentGPAMap.entrySet()) {
            if (entry.getValue() < avg) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Grades studentGPA = new Grades();
        
        
        studentGPA.addStudent("Aysu", 3.5);
        studentGPA.addStudent("Fidan", 3.3);
        studentGPA.addStudent("Cavid", 3.8);
        studentGPA.addStudent("Tunar", 2.1);
        
        
        System.out.println("Top students: " + studentGPA.getTopStudents());
        
        
        System.out.println("Average GPA: " + studentGPA.getAverageGPA());
        
        
        System.out.println("Number of students with GPA below average: " + studentGPA.countBelowAverage());
    }
}
