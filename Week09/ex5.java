

import java.util.HashMap;
import java.util.Map;

public class ex5 {
    public static void main(String[] args) {
         Map<String, Double> students = new HashMap<>();
         students.put("Ayten", 3.8);
         students.put("Ilqar", 1.8);
         students.put("Daniz", 3.1);
         students.put("Firangiz", 2.9);
         students.put("Farida", 2.8);

         double highestGPA = 0;
         String bestStudent = "";
         for (Map.Entry<String, Double> entry : students.entrySet()) {
             if (entry.getValue() > highestGPA) {
                 highestGPA = entry.getValue();
                 bestStudent = entry.getKey();
             }
         }
         System.out.println(bestStudent + " has the highest GPA of " + highestGPA);
 
         double total = 0;
         for (Double gpa : students.values()) {
             total += gpa;
         }
         double averageGPA = total / students.size();
         System.out.println("The average GPA of all students is " + averageGPA);
 
         int belowAverage = 0;
         for (Double gpa : students.values()) {
             if (gpa < averageGPA) {
                 belowAverage++;
             }
         }
         System.out.println(belowAverage + " students have less GPA than the average");
     
    }
}
