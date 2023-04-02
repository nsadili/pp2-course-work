package week09;

import java.util.*;

public class Grades {
    private Map<String, Double> gradesMap = new HashMap<>();

    public static void main(String[] args) {
        Grades example = new Grades();

        example.addStudent("Ulkar", 2.2);
        example.addStudent("Nijat", 2.9);
        example.addStudent("Rovshan", 2.5);

        List<String> highestGpaStudents = example.getHighestGpaStudents();
        System.out.println("Student(s) with the highest GPA: " + highestGpaStudents);

        double averageGpa = example.getAverageGpa();
        System.out.println("Average GPA of all students: " + averageGpa);

        int numStudentsBelowAverage = example.getNumStudentsBelowAverage();
        System.out.println("Number of students with GPA below average: " + numStudentsBelowAverage);
    }

    public void addStudent(String name, double gpa) {
        gradesMap.put(name, gpa);
    }

    public List<String> getHighestGpaStudents() {
        double highestGpa = Double.MIN_VALUE;
        for (double gpa : gradesMap.values()) {
            highestGpa = Math.max(highestGpa, gpa);
        }

        List<String> highestGpaStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : gradesMap.entrySet()) {
            if (entry.getValue() == highestGpa) {
                highestGpaStudents.add(entry.getKey());
            }
        }

        return highestGpaStudents;
    }

    public double getAverageGpa() {
        double sumGpa = 0;
        for (double gpa : gradesMap.values()) {
            sumGpa += gpa;
        }

        double averageGpa = sumGpa / gradesMap.size();
        return averageGpa;
    }

    public int getNumStudentsBelowAverage() {
        double averageGpa = getAverageGpa();

        int numStudentsBelowAverage = 0;
        for (double gpa : gradesMap.values()) {
            if (gpa < averageGpa) {
                numStudentsBelowAverage++;
            }
        }

        return numStudentsBelowAverage;
    }
}

