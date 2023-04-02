//import java.util.Comparator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.TreeMap;

public class Grades{

    public static void main(String[] args) {
        
    Map<String,Double> gpa = new HashMap<>(

      //  new Comparator<String>() {
         //    @Override
         //   public int compare(String o1, String o2) {
          //    return o2.length()-o1.length();
          //  }
       // }
    );

   gpa.put("Selya", 2.5);
   gpa.put("Gulshan", 3.2);
   gpa.put("Aydan", 1.4);
   gpa.put("Sultan", 4.0);

   double maxGPA = Double.MIN_VALUE;
   List<String> topStudents = new ArrayList<>();
   for (Map.Entry<String, Double> entry : gpa.entrySet()) {
       Double Gpa = entry.getValue();
       if (Gpa > maxGPA) {
           maxGPA = Gpa;
           topStudents.clear();
           topStudents.add(entry.getKey());
       } else if (Gpa == maxGPA) {
           topStudents.add(entry.getKey());
       }
   }

   //  student(s) with the highest GPA
   System.out.println("Top student(s) with highest GPA:");
   for (String student : topStudents) {
       System.out.println(student + " - GPA: " + maxGPA);
   }
     //the average gpa of all the students
        double sum = 0.0;
        for (double Gpa : gpa.values()) {
            sum += Gpa;
        }
        double averageGPA = sum / gpa.size();
        System.out.println("Average GPA of all students is " + averageGPA);

     //number of students with gpa less than the average
        int count = 0;
        for (double Gpa : gpa.values()) {
            if (Gpa < averageGPA) {
                count++;
            }
        }
        System.out.println(count + " student(s) have less GPA than the average GPA.");
    }


}