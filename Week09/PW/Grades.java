import java.util.*;

public class Grades {

    public static void main(String[] args) {
        Map<String, Double> studentGPAMap = new HashMap<>();

        studentGPAMap.put("1", 2);
        studentGPAMap.put("2", 3);
        studentGPAMap.put("3", 2.7);
        studentGPAMap.put("4", 3.9);

        List<String> topStudents = new ArrayList<>();
        double highestGPA = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : studentGPAMap.entrySet()) {
            if (entry.getValue() > highestGPA) {
                topStudents.clear();
                topStudents.add(entry.getKey());
                highestGPA = entry.getValue();
            } else if (entry.getValue() == highestGPA) {
                topStudents.add(entry.getKey());
            }
        }
        System.out.println(topStudents);

        double s = 0.0;
        for (double gpa : studentGPAMap.values()) {
            s += gpa;
        }
        double averageGPA = s / studentGPAMap.size();
        System.out.println(averageGPA);

        int cnt = 0;
        for (double gpa : studentGPAMap.values()) {
            if (gpa < averageGPA) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}