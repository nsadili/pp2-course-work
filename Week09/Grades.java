import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> students = new LinkedHashMap<>();
        students.put("Rufat", 3.47);
        students.put("Shamil", 4.00);
        students.put("Nariman", 3.07);
        students.put("Arzum", 2.64);
        students.put("Ibrahim", 3.67);
        
        System.out.println("The average of all students: "+averageGpa(students));

        System.out.println("The maximum gpa: "+maxGpa(students));

        System.out.println(String.format("Students with gpa less than average(%f): ", 
        averageGpa(students))+lessThanAverage(students));

        System.out.println(String.format("The number of students with gpa less than average(%f): ", 
        averageGpa(students))+lessThanAverage(students).size());
        
        

    }    

    public static double averageGpa(Map<String, Double> map){
        double sum=0, cnt=0;
        for (String key: map.keySet()){
            Double value = map.get(key);
            sum+=value;
            cnt++;
        }
        return sum/cnt;
        
    }

    static double maxGpa(Map<String, Double> map){
        double max=0;
        for (String key: map.keySet()){
            Double value = map.get(key);
            if (map.get(key)>max) max=map.get(key);
        }
        return max;
        
    }

    static Map<String, Double> lessThanAverage(Map<String, Double> map){
        Map<String, Double> lessThanAverage = new HashMap<>();
        for (String key: map.keySet()){
            Double value = map.get(key);
            if (map.get(key)<averageGpa(map)) lessThanAverage.put(key, value);
        }
        return lessThanAverage;
    }

}
