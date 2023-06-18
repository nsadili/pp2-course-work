package Week09;

import java.util.*;

public class Grades {
    public static void main(String[] args) {
    
        Map<String, Double> studentGPAs = new HashMap<>();
        
        studentGPAs.put("Ramil", 3.7);
        studentGPAs.put("Farid", 3.2);
        studentGPAs.put("Zaur", 4.0);
        studentGPAs.put("Firangiz", 3.9);
        studentGPAs.put("Farrukh", 2.8);
        
        double highestGPA = Collections.max(studentGPAs.values());
        List<String> topStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGPAs.entrySet()) {
            if (entry.getValue() == highestGPA) {
                topStudents.add(entry.getKey());
            }
        }
        System.out.println("The student(s) with the highest GPA is/are: " + topStudents);

        double sumGPAs = 0;
        for (double gpa : studentGPAs.values()) {
            sumGPAs += gpa;
        }
        double averageGPA = sumGPAs / studentGPAs.size();
        System.out.println("The average GPA of all the students is: " + averageGPA);
        
        int numBelowAverage = 0;
        for (double gpa : studentGPAs.values()) {
            if (gpa < averageGPA) {
                numBelowAverage++;
            }
        }
        System.out.println("The number of students with less GPA than the average is: " + numBelowAverage);
    }
}
