import java.util.HashMap;
import java.util.Map;

public class Grades {
    private Map<String, Double> studentGPA;

    public Grades() {
        studentGPA = new HashMap<>();
    }

    public void addStudent(String name, double gpa) {
        studentGPA.put(name, gpa);
    }

    public void printHighestGPA() {
        String highestGPAStudent = "";
        double highestGPA = 0.0;

        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                highestGPAStudent = entry.getKey();
            }
        }

        
        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() == highestGPA) {
                System.out.println(entry.getKey());
            }
        }
    }

    public void printAverageGPA() {
        double totalGPA = 0.0;

        for (double gpa : studentGPA.values()) {
            totalGPA += gpa;
        }

        double avgGPA = totalGPA / studentGPA.size();
        System.out.println(avgGPA);
    }

    public void printNumBelowAverage() {
        double totalGPA = 0.0;

        for (double gpa : studentGPA.values()) {
            totalGPA += gpa;
        }

        double avgGPA = totalGPA / studentGPA.size();

        int numBelowAvg = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < avgGPA) {
                numBelowAvg++;
            }
        }

        System.out.println(numBelowAvg);
    }
}
