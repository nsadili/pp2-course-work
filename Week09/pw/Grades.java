import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Grades{
    public static void main(String[] args) {
       TreeMap<String, Double> grades = new TreeMap<>(new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
        
       });

       grades.put("Roya", 3.9);
       grades.put("Sevda", 3.5);
       grades.put("Ayan", 4.0);
       grades.put("Nihad", 2.8);

       double maxGpa = 0.0;
       List<String> highGpaStudents = new ArrayList<>();

       Iterator<String> it = grades.keySet().iterator();
       while (it.hasNext()) {
        String name = it.next();
        double gpa = grades.get(name);

        if (gpa > maxGpa) {
            maxGpa = gpa;
            highGpaStudents.clear();
            highGpaStudents.add(name);
        } else if (gpa == maxGpa) {
            highGpaStudents.add(name);
        }
    }

    System.out.println("Student with the maximum gpa " + highGpaStudents);

     double sumOfGpa = 0.0;

     for(double gpa :grades.values()){
        sumOfGpa += gpa;
     }

    double avarageGpa = sumOfGpa / grades.size();
    System.out.println("Avarage gpa " + avarageGpa);

     int gpaBelowAverage = 0;
     for (double gpa : grades.values()) {
         if (gpa < avarageGpa) {
             gpaBelowAverage++;
         }
     }
     System.out.println("Number of students with less GPA than the average " + gpaBelowAverage);
       }
    }
