package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        grades.put("John", 3.5);
        grades.put("Sarah", 3.8);
        grades.put("Michael", 3.2);
        grades.put("Emily", 3.6);
        grades.put("Daniel", 3.9);
        
        double highestGPA = 0.0;
        List<String> highestGPAs = new ArrayList<>();
        for(Map.Entry<String, Double> entry: grades.entrySet()) {
         
            {
                highestGPA = entry.getValue();
                highestGPAs.clear();
                highestGPAs.add(entry.getKey());
            } if (entry.getValue() == highestGPA) {
                highestGPAs.add(entry.getKey());
            } 
        }
        System.out.println("The student(s) who have achieved the highest GPA are: " + highestGPAs);

        double totalGPA = 0.0;
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            totalGPA += entry.getValue();
        }
        double averageGPA = totalGPA / grades.size();
        System.out.println("The average GPA of all the students is: " + averageGPA);

        int count = 0;
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            if (entry.getValue() < averageGPA) {
                count++;
            }
        }
        System.out.println("The count of students with a GPA lower than the average is: " + count);
    }
}