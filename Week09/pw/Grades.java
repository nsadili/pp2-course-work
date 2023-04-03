import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();

        
        studentGrades.put("Aysel Panahova", 3.9);
        studentGrades.put("Nubar Ahmedova", 3.8);
        studentGrades.put("Aysel Karimli", 3.7);
    
       
        double highestGPA = 0.0;
        String topStudent = "";
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("The student with the highest GPA is " + topStudent + " with a GPA of " + highestGPA);

       
        double totalGPA = 0.0;
        for (double grade : studentGrades.values()) {
            totalGPA += grade;
        }
        double averageGPA = totalGPA / studentGrades.size();
        System.out.println("The average GPA of all the students is " + averageGPA);

       
        int count = 0;
        for (double grade : studentGrades.values()) {
            if (grade < averageGPA) {
                count++;
            }
        }
        System.out.println(count + " student(s) have less GPA than the average");
    }
}
