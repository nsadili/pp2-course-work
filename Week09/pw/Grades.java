import java.util.LinkedHashMap;
import java.util.Map;

public class Grades{

    public static void main(String[] args) {
        Map<String, Double> grades = new LinkedHashMap<>();

        grades.put("Murad", 3.5);
        grades.put("Oktay", 3.2);
        grades.put("Irshad", 3.1);

        System.out.println(grades);

        
        double maxGPA = 0;
        String topStudent = "";
        for(Map.Entry<String, Double> entry: grades.entrySet()){
            if(entry.getValue() > maxGPA){
                maxGPA = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        double sum = 0;
        for (Double grade : grades.values()){
            sum += grade;
        }

        double avg = sum / grades.size();


        int cnt = 0;
        for (Double grade : grades.values()){
            if(grade < avg){
                cnt++;
            }
        }



        System.out.println("The student with max GPA: " + topStudent);
        System.out.println("Average GPA: " + avg);
        System.out.println("Number of students with GPA less than average: " + cnt);
    }
 }