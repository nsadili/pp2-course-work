
import java.util.*;
public class Grades {
    public static void main(String[] args) {
        HashMap<String, Float> grades = new HashMap<>();
        grades.put("Madina Alili", 3.7f);
        grades.put("Sema Sadigi", 3.9f);
        grades.put("Agil Aghayev", 2.0f);

        float max = 0;
        for (String x : grades.keySet()) {
            if (grades.get(x).compareTo(max) > 0)
                max = grades.get(x);
        }

        System.out.println(max);

        float sum = 0;
        for (String x : grades.keySet()) {
            sum += grades.get(x);
        }
        float ave=sum / grades.size();
        System.out.println("Average is: " + ave);


        int numOfStudents=0;
        for (String x : grades.keySet());{
        if(grades.get(x) < ave)
            numOfStudents++;
        }

        System.out.println(numOfStudents);

    }
}