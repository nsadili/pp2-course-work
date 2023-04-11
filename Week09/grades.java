import java.util.*;

public class grades {
    public static void main(String[] args) {
        
        Map<String, Double> studentsGPA = new HashMap<>();


        studentsGPA.put("Ismayil", 3.5);
        studentsGPA.put("Emin", 4.0);
        studentsGPA.put("Evez", 2.8);
        studentsGPA.put("Ismael", 3.9);

        
        double maxGPA = Collections.max(studentsGPA.values());
        List<String> bestStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentsGPA.entrySet()) {
            if (entry.getValue() == maxGPA) {
                bestStudents.add(entry.getKey());
            }
        }
        System.out.println(" Highest GPA: " + bestStudents);

       
        double totalGPA = 0.0;
        for (double gpa : studentsGPA.values()) {
            totalGPA += gpa;
        }
        double averageGPA = totalGPA / studentsGPA.size();
        System.out.println("Average GPA : " + averageGPA);

       
        int count = 0;
        for (double gpa : studentsGPA.values()) {
            if (gpa < averageGPA) {
                count++;
            }
        }
        System.out.println("less GPA than the average: " + count);
    }
}
