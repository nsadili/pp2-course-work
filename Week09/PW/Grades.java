import java.util.*;

public class StudentGPA {

    public static void main(String[] args) {
        Map<String, Double> studentGPAMap = new HashMap<>();

        studentGPAMap.put("Asgar", 2.3);
        studentGPAMap.put("Ismayil", 3.5);
        studentGPAMap.put("CMuataz", 2.7);
        studentGPAMap.put("Abdullah", 3.9);

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
    /* Student with the highest gpa is Ismayil.
    Avarage gpa will be 3.1
    Number of students whose gpa is lower than avaragge is 2 (Muataz and Asgar)
     */
}