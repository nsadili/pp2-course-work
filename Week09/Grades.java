import java.util.LinkedHashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> students = new LinkedHashMap<>();
        students.put("Rufat", 3.47);
        students.put("Shamil", 4.00);
        students.put("Nariman", 3.07);
        students.put("Arzum", 3.67);
        students.put("Ibrahim", 3.67);
        
        System.out.println("The average of all students: "+averageGpa(students));


        

    }
    static double averageGpa(Map<String, Double> map){
        double sum=0, cnt=0;
        for (String key: map.keySet()){
            Double value = map.get(key);
            sum+=value;
            cnt++;
        }
        return sum/cnt;
        
    }

    static double maxGpa(Map<String, Double> map){
        double sum=0, cnt=0;
        for (String key: map.keySet()){
            Double value = map.get(key);
            sum+=value;
            cnt++;
        }
        return sum/cnt;
        
    }
}
