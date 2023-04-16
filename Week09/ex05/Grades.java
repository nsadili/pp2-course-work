package Week09.ex05;

import java.util.*;

public class Grades {

    private Map<String, Double> studentMap;

    public Grades() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String name, double gpa) {
        studentMap.put(name, gpa);
    }

    public List<String> getHighestGPA() {
        List<String> highestGPAStudents = new ArrayList<>();
        double maxGPA = Double.MIN_VALUE;
        
        for (Map.Entry<String, Double> entry : studentMap.entrySet()) {
            if (entry.getValue() > maxGPA) {
                maxGPA = entry.getValue();
                highestGPAStudents.clear();
                highestGPAStudents.add(entry.getKey());
            } else if (entry.getValue() == maxGPA) {
                highestGPAStudents.add(entry.getKey());
            }
        }
        return highestGPAStudents;
    }

    public double getAverageGPA() {
        double sumGPA = 0.0;

        for (double gpa : studentMap.values()) {
            sumGPA += gpa;
        }
        return sumGPA / studentMap.size();
    }

    public int getNumBelowAverage() {
        double avgGPA = getAverageGPA();
        int count = 0;

        for (double gpa : studentMap.values()) {
            if (gpa < avgGPA) {
                count++;
            }
        }
        return count;
    }

    public Map<String, Double> getStudentMap() {
        return studentMap;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.addStudent("Sadiq", 3.5);
        grades.addStudent("Samir", 4.0);
        grades.addStudent("Mehdi", 3.8);
        grades.addStudent("Ali", 3.9);

        System.out.println("Students with highest GPA: " + grades.getHighestGPA());
        System.out.println("Average GPA: " + grades.getAverageGPA());
        System.out.println("Number of students below average GPA: " + grades.getNumBelowAverage());
    }

}

