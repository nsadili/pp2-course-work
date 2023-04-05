import java.util.*;

public class Grades {

    public static void main(String[] args) {

        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Student 1", 2.8);
        studentGrades.put("Student 2", 1.5);
        studentGrades.put("Student 3", 3.6);
        studentGrades.put("Student 4", 2.7);
        studentGrades.put("Student 5", 3.9);

        List<String> topStudents = new ArrayList<>();
        double maxGPA = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            double gpa = entry.getValue();
            if (gpa > maxGPA) {
                topStudents.clear();
                topStudents.add(entry.getKey());
                maxGPA = gpa;
            } else if (gpa == maxGPA) {
                topStudents.add(entry.getKey());
            }
        }
        System.out.println("Student(s) with the highest GPA: " + topStudents);

        double sum = 0;
        for (double gpa : studentGrades.values()) {
            sum += gpa;
        }
        double averageGPA = sum / studentGrades.size();
        System.out.println("Average GPA of all students: " + averageGPA);

        int count = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGPA) {
                count++;
            }
        }
        System.out.println("Number of students with less GPA than the average: " + count);
    }
}
