package Pw;

import java.util.HashMap;
import java.util.Map;

public class Grades {
    private Map<String, Double> studentGPA;

    public Grades() {
        this.studentGPA = new HashMap<>();
    }

    public void addStudent(String name, double gpa) {
        studentGPA.put(name, gpa);
    }



    public String findTopStudent() {
        double maxGPA = 0;
        String topStudent = "";

        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() > maxGPA) {
                maxGPA = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        return topStudent;
    }



    public double findAverageGPA() {
        double sum = 0.0;

        for (double gpa : studentGPA.values()) {
            sum += gpa;
        }

        return sum / studentGPA.size();
    }



    public int countBelowAverage() {
        double averageGPA = findAverageGPA();

        int count = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < averageGPA) {
                count++;
            }
        }

        return count;
    }


    
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.addStudent("Elmin Suleymanli", 3.2);  // b. Adding some students to the map.
        grades.addStudent("Aymir Seyidov", 3);
        grades.addStudent("Bahruz Zeynalov", 2.6);
        grades.addStudent("Ravan Mehraliyev", 2.5);

        System.out.println("Student with highest GPA: " + grades.findTopStudent());  // c. Finds the student(s) with the highest gpa.
        System.out.println("Average GPA: " + grades.findAverageGPA()); // d. Finds the average gpa of all the students.

        System.out.println("Number of students with GPA less than average: " + grades.countBelowAverage());// e. Finds the number of students who have less gpa than the average.

    }
}
