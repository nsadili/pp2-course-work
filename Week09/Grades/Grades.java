package Grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grades {
    private static Map<String, Double> student = new HashMap<>();

    public static void main(String[] args) {
        student.put("Akif", 4.0);
        student.put("Cavanshir", 3.9);
        student.put("Babek", 2.88);
        student.put("Koroglu", 1.89);
        student.put("Afdandil", 2.01);
        student.put("Isfahan", 4.0);
        student.put("LeBron James", 4.0);

        System.out.println(findHighestGPA(student));
        System.out.println(getAverageGPA(student));
        System.out.println(getNumBelowAvg(student));
    }

    private static List<String> findHighestGPA(Map<String, Double> student) {
        List<String> highestGPA = new ArrayList<>();
        double max = 0.0;

        for (Map.Entry<String, Double> x : student.entrySet()) {
            if (x.getValue() > max) {
                max = x.getValue();
            }
        }
        for (Map.Entry<String, Double> x : student.entrySet()) {
            if (x.getValue() == max) {
                highestGPA.add(x.getKey());
            }
        }
        return highestGPA;
    }

    public static double getAverageGPA(Map<String, Double> student) {
        double averageGPA = 0.0;
        
        for (Map.Entry<String, Double> x : student.entrySet()) {
            averageGPA += x.getValue();
        }
        
        return averageGPA / student.size();
    }

    public static int getNumBelowAvg(Map<String, Double> student) {
        double Average = getAverageGPA(student);
        int count = 0;
        
        for (Map.Entry<String, Double> x : student.entrySet()) {
            if (x.getValue() < Average) {
                count++;
            }
        }
        return count;
    }
}