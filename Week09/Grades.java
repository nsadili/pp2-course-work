package Week09;

import java.util.HashMap;

public class Grades {
    public static void main(String[] args) {
        HashMap<String, Float> grades = new HashMap<>();

        grades.put("Shamil Aliyev", 2.6f);
        grades.put("Babayev Shahin", 3.0f);
        grades.put("Suel Heybatova", 4.0f);
        
        float max = 4;

        for (String x : grades.keySet()) {
            if(grades.get(x).compareTo(max) > 0)
            max = grades.get(x);
        }
        System.out.println("The highest GPA: " + max);
    }

    float sum = 0;
    


         

    
    

}
