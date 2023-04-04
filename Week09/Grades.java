import java.util.*;

public class Grades {
    public static void main(String[] args) {
 
        HashMap<String, Double> gradesMap = new HashMap<String, Double>();

        gradesMap.put("Ali", 3.5);
        gradesMap.put("Nihat", 3.0);
        gradesMap.put("Ravan", 2.5);
        gradesMap.put("Hazrat", 2.0);

        System.out.println("Student(s) with the highest gpa: ");
        double maxGpa = 0;
        for (String key : gradesMap.keySet()) {
            if (gradesMap.get(key) > maxGpa) {
                maxGpa = gradesMap.get(key);
            }
        }
        for (String key : gradesMap.keySet()) {
            if (gradesMap.get(key) == maxGpa) {
                System.out.println(key);
            }
        }

        System.out.println("Average gpa of all the students: ");
        double sum = 0;
        for (String key : gradesMap.keySet()) {
            sum += gradesMap.get(key);
        }
        System.out.println(sum / gradesMap.size());
 
        System.out.println("Number of students who have less gpa than the average: ");
        int count = 0;
        for (String key : gradesMap.keySet()) {
            if (gradesMap.get(key) < sum / gradesMap.size()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
