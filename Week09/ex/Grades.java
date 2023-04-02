import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Grades{
    public static void main(String[] args) {
        Map<String, Double> a = new HashMap<>();
    
        a.put("Nariman", 3.07);
        a.put("Shamil", 4.0);
        a.put("John", 2.0);

        highest(a);
        System.out.println("Average: "+ average(a));
        System.out.println("Students more than Average: "+moreThanAverage(a));

        
        
    }
    public static void highest(Map<String, Double> b){
        var mx = Double.MIN_VALUE;
        String student = null;

        for(Map.Entry<String, Double> entry: b.entrySet()){
            
            if(entry.getValue()>mx){
                student=entry.getKey();
                mx=entry.getValue();
            }
            
        }
            System.out.println("The student with the highest GPA is " + student + " with a GPA of " + mx);
    }

    public static double average(Map<String, Double> b){
        double sum=0;
        for(double gpa: b.values()){
            sum+=gpa;
        }
        return sum/(b.size());
    }

    public static int moreThanAverage(Map<String, Double> b){
        int cnt = 0;
        for (double gpa : b.values()) {
            if (gpa < average(b)) {
                cnt++;
            }
        }
        return cnt;
    }

}