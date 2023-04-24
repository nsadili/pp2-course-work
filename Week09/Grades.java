package Week09;

import java.util.*;

public class Grades {
    private Map<String, Double> gpaMap;

    public Grades() {
        this.gpaMap = new HashMap<>();
    }

    public void addStudent(String name, double gpa) {
        gpaMap.put(name, gpa);
    }

    public List<String> getTopStudents() {
        List<String> topStudents = new ArrayList<>();
        double highestGpa = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : gpaMap.entrySet()) {
            if (entry.getValue() > highestGpa) {
                topStudents.clear();
                topStudents.add(entry.getKey());
                highestGpa = entry.getValue();
            } else if (entry.getValue() == highestGpa) {
                topStudents.add(entry.getKey());
            }
        }

        return topStudents;
    }

    public double getAverageGpa() {
        double totalGpa = 0.0;
        for (double gpa : gpaMap.values()) {
            totalGpa += gpa;
        }
        return totalGpa / gpaMap.size();
    }

    public int countBelowAverage() {
        double averageGpa = getAverageGpa();
        int count = 0;
        for (double gpa : gpaMap.values()) {
            if (gpa < averageGpa) {
                count++;
            }
        }
        return count;
    }

    public Map<String, Double> getGpaMap() {
        return gpaMap;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.addStudent("Vidadi", 3.8);
        grades.addStudent("Naik", 3.4);
        grades.addStudent("Leyli", 4.0);
        grades.addStudent("Banu", 3.9);
        System.out.println(grades.getGpaMap());
        

        List<String> topStudents = grades.getTopStudents();
        System.out.println("Top student(s): " + topStudents);
        

        double averageGpa = grades.getAverageGpa();
        System.out.println("Average GPA: " + averageGpa);
       

        int countBelowAverage = grades.countBelowAverage();
        System.out.println("Number of students below average: " + countBelowAverage);
        
    }
}
