import java.util.Map;
import java.util.HashMap;

public class Grades {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Fuad", 100);
        grades.put("Fuad2", 90);
        grades.put("Fuad3", 80);
        grades.put("Fuad4", 70);

        int max = 0;
        int avg = 0;
        int lessThanAvg = 0;
        for (String key : grades.keySet()) {
            if (grades.get(key) > max) {
                max = grades.get(key);
            }
            avg += grades.get(key);
        }

        avg/=grades.size();

        for(String key : grades.keySet()){
            if(grades.get(key) < avg){
                lessThanAvg++;
            }
        }

        System.out.println("Max grade: " + max);
        System.out.println("Average grade: " + avg);
        System.out.println("Less that avg: " + lessThanAvg);
    }
}
