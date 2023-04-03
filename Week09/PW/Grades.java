package PW;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Leyla", 4.0);
        grades.put("Elvin", 2.5);
        grades.put("Laman", 3.2);
        grades.put("Amir", 3.5);
        grades.put("Zahra", 2.2);
        grades.put("Zaur", 4.0);

        System.out.println("Student(s) with the highest GPA: " + highestGpa(grades));
        System.out.printf("Average GPA: %.2f\n", averageGpa(grades));
        System.out.println("Student number with GPA less than the average: " + lessThanAverage(grades));
    }

    static public List<String> highestGpa(Map<String, Double> grades){
        double highest = 0;
        List<String> students = new ArrayList<>();
        for (Map.Entry<String, Double> grade: grades.entrySet()){
            highest = grade.getValue() > highest ? grade.getValue() : highest;
        }
        for (Map.Entry<String, Double> grade: grades.entrySet()){
            if (grade.getValue() == highest) students.add(grade.getKey());
        }
        return students;
    }

    static public double averageGpa(Map<String, Double> grades){
        double sum = 0;
        int count = 0;
        for (Map.Entry<String, Double> grade: grades.entrySet()){
            sum += grade.getValue();
            count++;
        }
        double average = sum / count;
        return average;
    }

    static public int lessThanAverage(Map<String, Double> grades){
        double average = averageGpa(grades);
        int count = 0;
        for (Map.Entry<String, Double> grade: grades.entrySet()){
            if (grade.getValue() < average) count++;
        }
        return count;
    }
}
