import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        grades.put("Namiq", 2.3);
        grades.put("Sanan", 3.0);
        grades.put("Ibo", 0.7);
        System.out.println(grades);

        Double max = 0.0;
        for (String s : grades.keySet()) {
            if (grades.get(s) > max) {
                max = grades.get(s);
            }
        }
        System.out.println("highest GPA: "+max);

        Double sum = 0.0;
        for (Double gpa : grades.values()){
            sum += gpa;
        }
        double avg = sum / grades.size();
        System.out.println("Avarage GPA: " + avg);
        
        int Below = 0;
        for (double gpa : grades.values()){
            if (gpa < avg) {
                Below++;
            }
        }
        System.out.println("Number of students who have less gpa than the average:" + Below);
    }
}