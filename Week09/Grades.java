import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> GPAMap = new HashMap<>();
        
        GPAMap.put("Ali", 3.72);
        GPAMap.put("Bob", 3.2);
        GPAMap.put("Mahammad", 4.0);
        GPAMap.put("Nihad", 2.81);
        GPAMap.put("Fazil", 3.93);

        System.out.println(max(GPAMap));
        System.out.println(avrg(GPAMap));
        System.out.println(less(GPAMap));

        
    }

    public static List<String> max(Map<String, Double> GPAMap) {
        List<String> max = new ArrayList<>();
        double highestGPA = Double.MIN_VALUE;
        
        for (double gpa : GPAMap.values()) {
            if (gpa > highestGPA) {
                highestGPA = gpa;
            }
        }
        
        for (Map.Entry<String, Double> entry : GPAMap.entrySet()) {
            if (entry.getValue() == highestGPA) {
                max.add(entry.getKey());
            }
        }
        
        return max;
    }
    

    public static double avrg(Map<String, Double> GPAMap) {
        Integer cnt=0;
        Double sum=0.0;
        for(Double x: GPAMap.values()){
            sum+=x;
            cnt++;
        }
        return sum/cnt;
    }

    public static int less(Map<String, Double> GPAMap) {
        int cnt=0;
        for(Double x: GPAMap.values()){
            if(x<avrg(GPAMap)){
                cnt++;
            }
        }
        return cnt;
    }
}
