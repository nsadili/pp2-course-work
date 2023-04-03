import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Grades
{
    public static void main(String[] args)
    {
        Map<String, Double> grades = new HashMap<>();

        grades.put("A", 3.7);
        grades.put("B", 1.4);
        grades.put("C", 2.6);
        grades.put("F", 4.0);
        grades.put("G", 3.5);


        double highGpa = Double.MIN_VALUE;
        String topStudent = "";
        for (Map.Entry<String, Double> entry : grades.entrySet())
        {
            if(entry.getValue() > highGpa)
            {
                highGpa = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("Student with highest GPA is " + topStudent + " with a GPA of " + highGpa);



        double totalGpa = 0;
        for (double gpa : grades.values())
        {
            totalGpa += gpa;
        }
        double avgGpa = totalGpa / grades.size();
        System.out.println("Average GPA is " + avgGpa);


        int count = 0;
        for(double gpa : grades.values())
        {
            if(gpa < avgGpa)
            count++;
        }
        System.out.println("The number of students who have less than average GPA is " + count);



        


    }
}