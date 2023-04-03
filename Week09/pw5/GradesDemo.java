package Week09.pw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Grades {
    //a. Create a map which stores names of students associated with their gpa.
    private Map<String, Double> studentGpas;

    public Grades() {
        this.studentGpas = new HashMap<>();
    }
    //b. Add some students to the map.
    public void addStudent(String name, double gpa) {
        studentGpas.put(name, gpa);
    }
    //c. Find the student(s) with the highest gpa.
    public List<String> getHighestGpaStudents() {
        double maxGpa = Collections.max(studentGpas.values());
        List<String> topStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGpas.entrySet()) {
            if (entry.getValue() == maxGpa) {
                topStudents.add(entry.getKey());
            }
        }
        return topStudents;
    }
    //d. Find the average gpa of all the students.
    public double getAverageGpa() {
        double sum = 0;
        for (double gpa : studentGpas.values()) {
            sum += gpa;
        }
        return sum / studentGpas.size();
    }
    //e. Find the number of students who have less gpa than the average.
    public int getNumStudentsBelowAverage() {
        double avgGpa = getAverageGpa();
        int count = 0;
        for (double gpa : studentGpas.values()) {
            if (gpa < avgGpa) {
                count++;
            }
        }
        return count;
    }
}

public class GradesDemo{
    public static void main(String[] args) {
        Grades analyzer = new Grades();
        analyzer.addStudent("Leyla", 4.0);
        analyzer.addStudent("Elvin", 2.5);
        analyzer.addStudent("Zehra", 1.0);
        analyzer.addStudent("Nihat", 2.9);
        analyzer.addStudent("Leman", 3.7);

        List<String> topStudents = analyzer.getHighestGpaStudents();
        System.out.println("Top students: " + topStudents);

        double avgGpa = analyzer.getAverageGpa();
        System.out.println("Average GPA: " + avgGpa);

        int numBelowAvg = analyzer.getNumStudentsBelowAverage();
        System.out.println("Number of students below average: " + numBelowAvg);
    }
}