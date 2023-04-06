import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Grades {
    private Map<String, Double> studentGPA;

    public Grades() {
        studentGPA = new HashMap<>();
    }

    public void addStudent(String name, double gpa) {
        studentGPA.put(name, gpa);
    }

    public List<String> findHighestGPAStudents() {
        double highestGPA = 0.0;
        List<String> highestGPAStudents = new ArrayList<>();

        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            double gpa = entry.getValue();
            if (gpa > highestGPA) {
                highestGPA = gpa;
                highestGPAStudents.clear();
                highestGPAStudents.add(entry.getKey());
            } else if (gpa == highestGPA) {
                highestGPAStudents.add(entry.getKey());
            }
        }
        return highestGPAStudents;
    }

    public double calculateAverageGPA() {
        double totalGPA = 0.0;

        for (double gpa : studentGPA.values()) {
            totalGPA += gpa;
        }

        return totalGPA / studentGPA.size();
    }

    public int countStudentsBelowAverage() {
        double averageGPA = calculateAverageGPA();
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
        grades.addStudent("Ayxan", 3.6);
        grades.addStudent("Nihad", 3.9);
        grades.addStudent("Huseyn", 3.4);
        grades.addStudent("Ali", 4.0);

        List<String> highestGPAStudents = grades.findHighestGPAStudents();
        System.out.println("Highest GPA students: " + highestGPAStudents);

        double averageGPA = grades.calculateAverageGPA();
        System.out.printf("Average GPA: %.2f%n", averageGPA);

        int studentsBelowAverage = grades.countStudentsBelowAverage();
        System.out.println("Students with GPA below average: " + studentsBelowAverage);
    }
}
